package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int8;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;
import static me.notanullpointer.xc2editor.save.parser.Utils.load8;

public class SDataBladeArts {

    public Int16 id;
    public Int16 recastRev;
    public Int16 field_4;
    public Int8 field_6;
    public Int8 level;
    public Int8 maxLevel;
    public Int8 field_9;
    public Int16 field_A;

    public SDataBladeArts fromByteArray(byte[] data) {
        id = load16(data, 0x0);
        recastRev = load16(data, 0x2);
        field_4 = load16(data, 0x4);
        field_6 = load8(data, 0x6);
        level = load8(data, 0x7);
        maxLevel = load8(data, 0x8);
        field_9 = load8(data, 0x9);
        field_A = load16(data, 0xA);
        return this;
    }

}
