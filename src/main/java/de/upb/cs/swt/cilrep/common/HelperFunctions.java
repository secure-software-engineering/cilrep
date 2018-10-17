package de.upb.cs.swt.cilrep.common;

import java.util.ArrayList;

public class HelperFunctions {
    public static Integer readNBytesIntoInt32(int _n, int _startIndex, byte[] _stream){
        Integer readValue = 0;
        int endIndex = _startIndex + _n - 1;
        for (int i = endIndex; i >= _startIndex; i--){
            readValue = (readValue << 8) + (_stream[i] & 0xff);
        }

        return readValue;
    }

    public static long readNBytesIntoLong(int _n, int _startIndex, byte[] _stream){
        long readValue = 0;
        int endIndex = _startIndex + _n - 1;
        for (int i = endIndex; i >= _startIndex; i--){
            readValue = (readValue << 8) + (_stream[i] & 0xff);
        }

        return readValue;
    }

    public static byte[] readNBytesIntoByteArr(int _n, int _startIndex, byte[] _stream){
        byte[] readBytes = new byte[_n];
        int endIndex = _startIndex + _n - 1;
        for (int i = endIndex, j = 0; i >= _startIndex; i--, j++){
            readBytes[j] = _stream[i];
        }

        return readBytes;
    }

    public static String readNBytesToStrSequential(int _n, int _startIndex, byte[] _stream){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < _n; i++){
            sb.append((char)_stream[_startIndex + i]);
        }
        return sb.toString();
    }

    public static Integer getNumberOfSetBits(long _number){
        Integer counter = 0;
        while (_number > 0){
            counter += (int)(_number & 1);
            _number >>= 1;
        }
        return counter;
    }

    public static boolean checkIfCertainBitIsSet(long _bitVector, Integer _bitNumber){
        return (_bitVector & (1 << _bitNumber)) > 0;
    }
}
