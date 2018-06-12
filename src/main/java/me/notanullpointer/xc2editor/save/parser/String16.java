package me.notanullpointer.xc2editor.save.parser;

public class String16 implements SaveComponent {

    Int8 string[] = new Int8[16];
    Int32 length;

    @Override
    public byte[] toByteArray() {
        return new byte[0];
    }

    @Override
    public String16 fromByteArray(byte[] bytes) {
        //TODO: STUB
        return this;
    }
}
