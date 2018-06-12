package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int32;

public class SDataMap {

    public Vec3Padded driverPositions[/*3*/];
    public Vec3Padded bladePositions[/*3*/];
    public Vec3Padded driverRotations[/*3*/];
    public Vec3Padded bladeRotations[/*3*/];
    public Int32 mapJumpId;

}
