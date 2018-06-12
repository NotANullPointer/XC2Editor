package me.notanullpointer.xc2editor.save.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Int64 implements SaveComponent {

    long value;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public byte[] toByteArray() {
        return ByteBuffer.allocate(8).putLong(value).order(ByteOrder.LITTLE_ENDIAN).array();
    }

    @Override
    public Int64 fromByteArray(byte[] bytes) {
        setValue(ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getLong());
        return this;
    }

}
