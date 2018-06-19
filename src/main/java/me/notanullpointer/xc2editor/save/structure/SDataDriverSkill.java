package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class SDataDriverSkill {

    public Int16 columns[/*3*/];
    public Int16 rowNum;
    public Int16 level;

    public SDataDriverSkill fromByteArray(byte[] data) {
        columns = new Int16[3];
        columns[0] = new Int16().fromByteArray(arrayRange(data, 0, 2));
        columns[1] = new Int16().fromByteArray(arrayRange(data, 2, 4));
        columns[2] = new Int16().fromByteArray(arrayRange(data, 4, 6));
        rowNum = new Int16().fromByteArray(arrayRange(data, 6, 8));
        level = new Int16().fromByteArray(arrayRange(data, 8, 0xA));
        return this;
    }

}
