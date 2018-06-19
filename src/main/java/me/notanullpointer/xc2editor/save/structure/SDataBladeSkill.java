package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int8;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;
import static me.notanullpointer.xc2editor.save.parser.Utils.load8;

public class SDataBladeSkill {

    public Int16 id;
    public Int8 field_2;
    public Int8 level;
    public Int8 maxLevel;
    public Int8 field_5;

    public SDataBladeSkill fromByteArray(byte[] data) {
        id = load16(data, 0x0);
        field_2 = load8(data, 0x2);
        level = load8(data, 0x3);
        maxLevel = load8(data, 0x4);
        field_5 = load8(data, 0x5);
        return this;
    }

}
