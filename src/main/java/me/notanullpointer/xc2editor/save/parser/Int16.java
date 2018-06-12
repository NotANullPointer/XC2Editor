package me.notanullpointer.xc2editor.save.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Int16 implements SaveComponent {

    short value;

    public short getValue() {
        return value;
    }

    public Int16 setValue(short value) {
        this.value = value;
        return this;
    }

    @Override
    public byte[] toByteArray() {
        return ByteBuffer.allocate(2).putShort(value).order(ByteOrder.LITTLE_ENDIAN).array();
    }

    @Override
    public Int16 fromByteArray(byte[] bytes) {
        setValue(ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getShort());
        return this;
    }

}
