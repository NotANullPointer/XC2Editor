package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class DriverArt {

    public Int32 ids[/*3*/];
    public Int32 weaponPoints;
    public Int32 totalWeaponPoints;

    public DriverArt fromByteArray(byte[] data) {
        ids = new Int32[3];
        ids[0] = new Int32().fromByteArray(arrayRange(data, 0, 4));
        ids[1] = new Int32().fromByteArray(arrayRange(data, 4, 8));
        ids[2] = new Int32().fromByteArray(arrayRange(data, 8, 12));
        weaponPoints = new Int32().fromByteArray(arrayRange(data, 12, 16));
        totalWeaponPoints = new Int32().fromByteArray(arrayRange(data, 16, 20));
        return this;
    }

    public Int32 getWeaponPoints() {
        return weaponPoints;
    }

    public Int32 getTotalWeaponPoints() {
        return totalWeaponPoints;
    }
}
