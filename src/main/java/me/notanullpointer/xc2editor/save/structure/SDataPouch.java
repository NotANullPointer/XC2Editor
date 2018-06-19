package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Float32;
import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class SDataPouch {

    public Float32 time;
    public Int16 itemId;
    public Int16 isEnabled;

    public SDataPouch fromByteArray(byte[] data) {
        time = new Float32().fromByteArray(arrayRange(data, 0x0, 0x4));
        itemId = new Int16().fromByteArray(arrayRange(data, 0x4, 0x6));
        isEnabled = new Int16().fromByteArray(arrayRange(data, 0x6, 0x8));
        return this;
    }

}
