package me.notanullpointer.xc2editor.save.parser;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Float32 implements SaveComponent {

    float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public byte[] toByteArray() {
        return ByteBuffer.allocate(4).putFloat(value).order(ByteOrder.LITTLE_ENDIAN).array();
    }

    @Override
    public Float32 fromByteArray(byte[] bytes) {
        setValue(ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getFloat());
        return this;
    }


}
