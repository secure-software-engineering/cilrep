package de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.common.HelperFunctions;

import java.util.ArrayList;
import java.util.List;

public class MetadataRoot {

    /* offset 0, size 4 */
    public Integer Signature = 0x424A5342;

    /* offset 4, size 2 */
    public Integer MajorVersion = 0x0001;

    /* offset 6, size 2 */
    public Integer MinorVersion = 0x0001;

    /* offset 8, size 4 */
    public Integer Reserved = 0x00000000;

    /* offset 12, size 4 (call this x) */
    public Integer LengthOfVersion;

    /* offset 16, size m (m is x padded to next 4-bytes) */
    public String Version;

    /* offset 16 + x, size 2 */
    public Integer Flags;

    /* offset 16 + x + 2, size 2 */
    public Integer NumberOfStreams;

    /* offset 16 + x + 4 */
    // Stream Headers
    public List<StreamHeader> StreamHeaders = null;

    public List<Stream> Streams = null;

    public Integer startIndex = 0;

    public void populateData(Integer _startIndex, byte[] _stream){
        this.startIndex = _startIndex;

        this.Signature = HelperFunctions.readNBytesIntoInt32(4, _startIndex, _stream);
        this.MajorVersion = HelperFunctions.readNBytesIntoInt32(2, _startIndex + 4, _stream);
        this.MinorVersion = HelperFunctions.readNBytesIntoInt32(2, _startIndex + 6, _stream);
        this.Reserved = HelperFunctions.readNBytesIntoInt32(4, _startIndex + 8, _stream);

        this.LengthOfVersion = HelperFunctions.readNBytesIntoInt32(4, _startIndex + 12, _stream);

        this.Version = HelperFunctions.readNBytesToStrSequential(this.LengthOfVersion,
                _startIndex + 16, _stream);

        this.Flags = HelperFunctions.readNBytesIntoInt32(2,
                _startIndex + 16 + this.LengthOfVersion, _stream);

        this.NumberOfStreams = HelperFunctions.readNBytesIntoInt32(2,
                _startIndex + 16 + this.LengthOfVersion + 2, _stream);

        Integer headersSize = this.populateStreamHeaders(_startIndex + 16 + this.LengthOfVersion + 4, _stream);

        // populate streams data
        this.populateStreams(_stream);
    }

    Integer populateStreamHeaders(Integer _startIndex, byte[] _stream){
        Integer bytesSoFar = 0;
        this.Streams = new ArrayList<>();
        for (int i = 0; i < this.NumberOfStreams; i++){
            StreamHeader sh = new StreamHeader();

            sh.Offset = HelperFunctions.readNBytesIntoInt32(4, _startIndex + bytesSoFar,
                    _stream);

            sh.StartingIndexInFile = this.startIndex + sh.Offset;

            bytesSoFar += 4;

            sh.Size = HelperFunctions.readNBytesIntoInt32(4, _startIndex + bytesSoFar, _stream);

            bytesSoFar += 4;

            Integer waitASecond = 0;
            StringBuilder nameSb = new StringBuilder();
            while (_stream[_startIndex + bytesSoFar] != 0
                    && waitASecond <= 32){
                nameSb.append((char)_stream[_startIndex + bytesSoFar]);
                waitASecond++;
                bytesSoFar++;
            }

            sh.Name = nameSb.toString();
            bytesSoFar += (4 - (waitASecond % 4));

            Stream s = null;
            if (sh.Name.contains(Constants.TILDESTREAMNAME)){
                s = new TildeStream();
            }
            else if(sh.Name.contains(Constants.STRINGSSTREAMNAME)){
                s = new StringsHeap();
            }


            if (s != null) {
                s.streamHeader = sh;
                this.Streams.add(s);
            }
        }

        return bytesSoFar;
    }

    void populateStreams(byte[] _stream){
        for (Stream s:
             this.Streams) {
            s.populateData(_stream);
        }
    }
}
