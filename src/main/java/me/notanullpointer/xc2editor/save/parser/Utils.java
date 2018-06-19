package me.notanullpointer.xc2editor.save.parser;

import java.util.Arrays;

public class Utils {

    public static byte[] arrayRange(byte[] in, int from, int to) {

        //from inclusive, to exclusive
        return Arrays.copyOfRange(in, from, to);

    }

    public static Int64 load64(byte[] data, int addr) {
        return new Int64().fromByteArray(arrayRange(data, addr, addr+8));
    }

    public static Int32 load32(byte[] data, int addr) {
        return new Int32().fromByteArray(arrayRange(data, addr, addr+4));
    }

    public static Int16 load16(byte[] data, int addr) {
        return new Int16().fromByteArray(arrayRange(data, addr, addr+2));
    }

    public static Int8 load8(byte[] data, int addr) {
        return new Int8().fromByteArray(arrayRange(data, addr, addr+1));
    }

    public static Float32 loadf32(byte[] data, int addr) {
        return new Float32().fromByteArray(arrayRange(data, addr, addr+4));
    }

    public static Int8[] loadGap(byte[] data, int addr, int len) {
        Int8[] res = new Int8[len];
        for(int i = 0; i < len; i++) {
            res[i] = load8(data, addr+i);
        }
        return res;
    }

    public static Int16[] loadArr16(byte[] data, int addr, int len) {
        Int16[] res = new Int16[len];
        for(int i = 0; i < len; i++) {
            res[i] = load16(data, addr+(i*2));
        }
        return res;
    }

    public static Int32[] loadArr32(byte[] data, int addr, int len) {
        Int32[] res = new Int32[len];
        for(int i = 0; i < len; i++) {
            res[i] = load32(data, addr+(i*4));
        }
        return res;
    }

    public static Int64[] loadArr64(byte[] data, int addr, int len) {
        Int64[] res = new Int64[len];
        for(int i = 0; i < len; i++) {
            res[i] = load64(data, addr+(i*8));
        }
        return res;
    }

    public static String16 loadS16(byte[] data, int addr) {
        return new String16().fromByteArray(arrayRange(data, addr, addr+0x14));
    }

    public static String32 loadS32(byte[] data, int addr) {
        return new String32().fromByteArray(arrayRange(data, addr, addr+0x24));
    }

    public static String mergeArrayWithoutLastElement(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length-1; i++) {
            builder.append(array[i]);
            builder.append(" ");
        }
        return builder.substring(0, builder.length()-1);
    }

    public static String lastArrayElement(String[] array) {
        return array[array.length-1];
    }

    public static String stringFromInt8Arr(Int8[] array) {
        char[] res = new char[array.length];
        for(int i = 0; i<res.length; i++) {
            res[i] = array[i].getValue();
        }
        return new String(res);
    }

}
