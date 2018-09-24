package de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders;

import java.util.List;

public class MetadataRoot {
    /* offset 0, size 4 */
    public final Integer Signature = 0x424A5342;

    /* offset 4, size 2 */
    public Integer MajorVersion = 0x0001;

    /* offset 6, size 2 */
    public Integer MinorVersion = 0x0001;

    /* offset 8, size 4 */
    public Integer Reserved = 0x00000000;

    /* offset 12, size 4 (call this x) */
    public Integer Length;

    /* offset 16, size m (m is x padded to next 4-bytes) */
    public String Version;

    /* offset 16 + x, size 2 */
    public Integer Flags;

    /* offset 16 + x + 2, size 2 */
    public Integer NumberOfStreams;

    /* offset 16 + x + 4, size 2 */
    // Stream Headers
    public List<StreamHeader> StreamHeaders = null;
}
