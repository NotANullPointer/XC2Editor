package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.Int16;
import me.notanullpointer.xc2editor.save.parser.Int32;
import me.notanullpointer.xc2editor.save.parser.Int8;

import static me.notanullpointer.xc2editor.save.parser.Utils.*;

public class SDataDriver {

    private byte[] data;

    private SDataIdea ideaLevels[/*4*/];
    private ActivateType activateType;
    private Int16 driverId;
    private Int16 setBlade;
    private Int16 equippedBlades[/*3*/];
    private Int32 gap_2C;
    private SDataDriverSkill skillRound1[/*5*/];
    private SDataDriverSkill skillRound2[/*5*/];
    private Int16 level;
    private Int16 hpMax;
    private Int16 strength;
    private Int16 powEther;
    private Int16 dex;
    private Int16 agility;
    private Int16 luck;
    private Int16 pArmor;
    private Int16 eArmor;
    private Int8 critRate;
    private Int8 guardRate;
    private Int32 field_A8;
    private Int8 gap_AC[/*3*/];
    private Int8 field_AF;
    private Int32 exp;
    private Int32 battleExp;
    private Int32 skillPoints;
    private Int32 totalSkillPoints;
    private DriverArt weapons[/*27*/];
    private Int8 gap_2DC[/*12*/];
    private Int16 accessoryId2;
    private Int8 gap_2EA;
    private Int8 accessory2Enabled;
    private Int32 accessoryHandle2;
    private Int8 driverArtLevels[/*525*/];
    private Int8 gap_4FD[/*119*/];
    private Int32 accessoryHandle0;
    private Int16 accessoryId0;
    private Int16 gap_57A;
    private Int32 accessoryHandle1;
    private Int16 accessoryId1;
    private Int16 gap_582;
    private SDataPouch pouchInfo[/*3*/];
    private Int8 gap_field_59C[/*3*/];
    private Int8 field_59F;

    public SDataDriver fromByteArray(byte[] data) {
        ideaLevels = loadIdeas(data);
        activateType = ActivateType.fromId(load16(data, 0x20));
        driverId = load16(data, 0x22);
        setBlade = load16(data, 0x24);
        equippedBlades = loadEquippedBlades(data);
        gap_2C = load32(data, 0x2C);
        skillRound1 = loadSkillRound(1, data);
        skillRound2 = loadSkillRound(2, data);
        level = load16(data, 0x94);
        hpMax = load16(data, 0x96);
        strength = load16(data, 0x98);
        powEther = load16(data, 0x9A);
        dex = load16(data, 0x9C);
        agility = load16(data, 0x9E);
        luck = load16(data, 0xA0);
        pArmor = load16(data, 0xA2);
        eArmor = load16(data, 0xA4);
        critRate = load8(data, 0xA6);
        guardRate = load8(data, 0xA7);
        field_A8 = load32(data, 0xA8);
        gap_AC = loadGap(data, 0xAC, 0x3);
        field_AF = load8(data, 0xAF);
        exp = load32(data, 0xB0);
        battleExp = load32(data, 0xB4);
        skillPoints = load32(data, 0xB8);
        totalSkillPoints = load32(data, 0xBC);
        weapons = loadWeapons(data);
        gap_2DC = loadGap(data, 0x2DC, 0xC);
        accessoryId2 = load16(data, 0x2E8);
        gap_2EA = load8(data, 0x2EA);
        accessory2Enabled = load8(data, 0x2EB);
        accessoryHandle2 = load32(data, 0x2EC);
        driverArtLevels = loadGap(data, 0x2F0, 0x20D);
        gap_4FD = loadGap(data, 0x4FD, 0x77);
        accessoryHandle0 = load32(data, 0x574);
        accessoryId0 = load16(data, 0x578);
        gap_57A = load16(data, 0x57A);
        accessoryHandle1 = load32(data, 0x57C);
        accessoryId1 = load16(data,0x580);
        gap_582 = load16(data, 0x582);
        pouchInfo = loadPouchInfo(data);
        gap_field_59C = loadGap(data, 0x59C, 0x3);
        field_59F = load8(data, 0x59F);
        return this;
    }

    private SDataIdea[] loadIdeas(byte[] data) {
        SDataIdea[] res = new SDataIdea[4];
        for(int i = 0; i < 4; i++) {
            res[i] = new SDataIdea().fromByteArray(arrayRange(data, 0x8*i, 0x8*(i+1)));
        }
        return res;
    }

    private SDataPouch[] loadPouchInfo(byte[] data) {
        SDataPouch[] res = new SDataPouch[3];
        for(int i = 0; i < 3; i++) {
            res[i] = new SDataPouch().fromByteArray(arrayRange(data, 0x584+0x8*i, 0x584+0x8*(i+1)));
        }
        return res;
    }

    private DriverArt[] loadWeapons(byte[] data) {
        DriverArt[] res = new DriverArt[27];
        for(int i = 0; i < 27; i++) {
            res[i] = new DriverArt().fromByteArray(arrayRange(data, 0xC0+0x14*i, 0xC0+0x14*(i+1)));
        }
        return res;
    }

    private Int16[] loadEquippedBlades(byte[] data) {
        Int16[] res = new Int16[3];
        for(int i = 0; i < 3; i++) {
            res[i] = load16(data, 0x26+0x2*i);
        }
        return res;
    }

    private SDataDriverSkill[] loadSkillRound(int num, byte[] data) {
        SDataDriverSkill[] res = new SDataDriverSkill[5];
        for(int i = 0; i < 5; i++) {
            res[i] = new SDataDriverSkill().fromByteArray(arrayRange(data, num == 1 ? 0x30+0xA*i : 0x62+0xA*i, num == 1 ? 0x30+0xA*(i+1) : 0x62+0xA*(i+1)));
        }
        return res;
    }

    public SDataIdea[] getIdeaLevels() {
        return ideaLevels;
    }

    public ActivateType getActivateType() {
        return activateType;
    }

    public Int16 getDriverId() {
        return driverId;
    }

    public Int16 getSetBlade() {
        return setBlade;
    }

    public Int16[] getEquippedBlades() {
        return equippedBlades;
    }

    public SDataDriverSkill[] getSkillRound1() {
        return skillRound1;
    }

    public SDataDriverSkill[] getSkillRound2() {
        return skillRound2;
    }

    public Int16 getLevel() {
        return level;
    }

    public Int16 getHpMax() {
        return hpMax;
    }

    public Int16 getStrength() {
        return strength;
    }

    public Int16 getPowEther() {
        return powEther;
    }

    public Int16 getDex() {
        return dex;
    }

    public Int16 getAgility() {
        return agility;
    }

    public Int16 getLuck() {
        return luck;
    }

    public Int16 getpArmor() {
        return pArmor;
    }

    public Int16 geteArmor() {
        return eArmor;
    }

    public Int8 getCritRate() {
        return critRate;
    }

    public Int8 getGuardRate() {
        return guardRate;
    }

    public Int32 getExp() {
        return exp;
    }

    public Int32 getBattleExp() {
        return battleExp;
    }

    public Int32 getSkillPoints() {
        return skillPoints;
    }

    public Int32 getTotalSkillPoints() {
        return totalSkillPoints;
    }

    public DriverArt[] getWeapons() {
        return weapons;
    }

    public Int16 getAccessoryId2() {
        return accessoryId2;
    }

    public Int32 getAccessoryHandle2() {
        return accessoryHandle2;
    }

    public Int8 isAccessory2Enabled() {
        return accessory2Enabled;
    }

    public Int8[] getDriverArtLevels() {
        return driverArtLevels;
    }

    public Int32 getAccessoryHandle0() {
        return accessoryHandle0;
    }

    public Int16 getAccessoryId0() {
        return accessoryId0;
    }

    public Int32 getAccessoryHandle1() {
        return accessoryHandle1;
    }

    public Int16 getAccessoryId1() {
        return accessoryId1;
    }

    public SDataPouch[] getPouchInfo() {
        return pouchInfo;
    }

    public byte[] getRawData() {
        return data;
    }
}
