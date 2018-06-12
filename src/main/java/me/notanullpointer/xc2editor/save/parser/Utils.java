package me.notanullpointer.xc2editor.save.parser;

import java.util.Arrays;

public class Utils {

    public static byte[] arrayRange(byte[] in, int from, int to) {

        //from inclusive, to exclusive
        return Arrays.copyOfRange(in, from, to);

    }

}
