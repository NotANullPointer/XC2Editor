package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Float32;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class Vec3 {

    public Float32 x, y, z;

    public Vec3 fromByteArray(byte[] data) {
        x = new Float32().fromByteArray(arrayRange(data, 0x0, 0x4));
        y = new Float32().fromByteArray(arrayRange(data, 0x4, 0x8));
        z = new Float32().fromByteArray(arrayRange(data, 0x8, 0xC));
        return this;
    }

}
