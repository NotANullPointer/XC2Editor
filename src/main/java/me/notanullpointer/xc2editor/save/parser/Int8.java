package me.notanullpointer.xc2editor.save.parser;

public class Int8 implements SaveComponent {

    char value;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public byte[] toByteArray() {
        return new byte[value];
    }

    @Override
    public Int8 fromByteArray(byte[] bytes) {
        setValue((char)bytes[0]);
        return this;
    }

}
