package me.notanullpointer.xc2editor.save.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Int32 implements SaveComponent {

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public byte[] toByteArray() {
        return ByteBuffer.allocate(4).putInt(value).order(ByteOrder.LITTLE_ENDIAN).array();
    }

    @Override
    public Int32 fromByteArray(byte[] bytes) {
        setValue(ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getInt());
        return this;
    }

}
