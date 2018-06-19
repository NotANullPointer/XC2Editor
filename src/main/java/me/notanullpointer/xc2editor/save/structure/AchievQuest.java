package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.load16;
import static me.notanullpointer.xc2editor.save.parser.Utils.load32;

public class AchievQuest {

    public Int16 questId;
    public Int16 field_2;
    public Int32 count;
    public Int32 maxCount;
    public Int16 field_C;
    public Int16 statsId;
    public Int16 taskType;
    public Int16 column;
    public Int16 row;
    public Int16 bladeId;
    public Int16 achievementId;
    public Int16 alignment;

    public AchievQuest fromByteArray(byte[] data) {
        questId = load16(data, 0x0);
        field_2 = load16(data, 0x2);
        count = load32(data, 0x4);
        maxCount = load32(data, 0x8);
        field_C = load16(data, 0xC);
        statsId = load16(data, 0xE);
        taskType = load16(data, 0x10);
        column = load16(data, 0x12);
        row = load16(data, 0x14);
        bladeId = load16(data, 0x16);
        achievementId = load16(data, 0x18);
        alignment = load16(data, 0x1A);
        return this;
    }

}
