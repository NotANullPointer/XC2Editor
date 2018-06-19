package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.*;

public class EquipHana {

    public Int16 roleItem;
    public Int16 atrItem;
    public ArtsEnhance bArtsEnhance[/*3*/];
    public ArtsEnhance nArts[/*3*/];
    public Int16 skills[/*6*/];
    public Int32 field_58[/*8*/];
    public Int16 powerCapacity;
    public Int16 unlockedCircuits;

    public EquipHana fromByteArray(byte[] data) {
        roleItem = load16(data, 0x0);
        atrItem = load16(data, 0x2);
        bArtsEnhance = loadArts(data, 1);
        nArts = loadArts(data, 2);
        skills = loadArr16(data, 0x4C, 6);
        field_58 = loadArr32(data, 0x58, 8);
        powerCapacity = load16(data, 0x78);
        unlockedCircuits = load16(data, 0x7A);
        return this;
    }

    private ArtsEnhance[] loadArts(byte[] data, int id) {
        ArtsEnhance[] res = new ArtsEnhance[3];
        for(int i = 0; i < 3; i++) {
            res[i] = new ArtsEnhance().fromByteArray(arrayRange(data, id==1 ? 0x4+0xC*i : 0x28+0xC*i, id==1 ? 0xC+0xC*(i+1) : 0x28+0xC*(i+1)));
        }
        return res;
    }

}
