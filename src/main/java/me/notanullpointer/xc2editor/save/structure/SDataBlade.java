package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.*;

import static me.notanullpointer.xc2editor.save.parser.Utils.*;

public class SDataBlade {

    private Int16 dataType;
    private Int16 creator;
    private Int16 setDriver;
    private Int16 bladeId;
    private Int32 bornTime;
    private SDataIdea ideaData[/*4*/];
    private Int32 field_2C;
    private Int8 field_30;
    private Int8 gap31[/*3*/];
    private Int32 trustPoints;
    private Int32 trustRank;
    private SDataBladeArts bArts[/*3*/];
    private SDataBladeArtsN nArts[/*3*/];
    private SDataBladeArtsEx bArtsEx[/*2*/];
    private SDataBladeSkill bladeSkills[/*3*/];
    private SDataBladeSkill fieldSkills[/*3*/];
    private Int8 extraParts2[/*4*/];
    private AchievInfo bArtsAchieve[/*3*/];
    private AchievInfo bSkillsAchieve[/*3*/];
    private AchievInfo fSKillsAchieve[/*3*/];
    private AchievInfo keyAchievement;
    private Int16 keyReleaseLevel;
    private FavoriteData favorites[/*2*/];
    private Int16 gap676;
    private Int16 equipOrbs[/*3*/];
    private Int16 gap67E;
    private Int32 equipOrbHandles[/*3*/];
    private EquipHana hanaEquip;
    private Int8 race;
    private Int8 gender;
    private Int16 still;
    private String16 modelResourceName;
    private String16 model2Name;
    private String16 motionResourceName;
    private String16 motion2Name;
    private String16 addMotionName;
    private String16 voiceName;
    private String16 clipEvent;
    private String16 com_SE;
    private String16 effectResourceName;
    private String16 com_VO;
    private String16 centerBone;
    private String16 camBone;
    private String32 seResourceName;
    private Int8 bladeSize;
    private Int8 weaponType;
    private Int8 orbNum;
    private Int8 atr;
    private Int8 personality;
    private Int8 extraParts;
    private Int8 eyeRot;
    private Int8 gap_827;
    private Int16 coolTime;
    private Int16 condition;
    private Int16 defWeapon;
    private Int16 chestHeight;
    private Int16 landingHeight;
    private Int16 rareNameId;
    private Int16 commonNameId;
    private Int16 scale;
    private Int16 wpnScale;
    private Int16 offsetId;
    private Int16 collisionId;
    private Int8 pArmor;
    private Int8 eArmor;
    private Int8 hpMaxRev;
    private Int8 strengthRev;
    private Int8 powEtherRev;
    private Int8 dexRev;
    private Int8 agilityRev;
    private Int8 luckRev;
    private Int8 questRace;
    private Int8 releaseLock;
    private Int8 footStep;
    private Int8 footStepEffect;
    private Int16 kitzunaLinkSet;
    private Int16 normalTalk;
    private Int16 gap_84E;
    private Int32 createEventId;
    private Int16 mountPoint;
    private Int16 mountObject;
    private Int8 name[/*64*/];
    private Int32 nameLength;
    private Int16 commonBladeIndex;
    private Int8 enableEngageRex;
    private Int8 bladeReleaseStatus;
    private Int8 isUnselect;
    private Int8 affinityChartStatus;
    private Int16 field_8A2;

    public SDataBlade fromByteArray(byte[] data) {
        dataType = load16(data, 0x0);
        creator = load16(data, 0x2);
        setDriver = load16(data, 0x4);
        bladeId = load16(data, 0x6);
        bornTime = load32(data, 0x8);
        ideaData = loadIdeas(data);
        field_2C = load32(data, 0x2C);
        field_30 = load8(data, 0x30);
        gap31 = loadGap(data, 0x31, 3);
        trustPoints = load32(data, 0x34);
        trustRank = load32(data, 0x38);
        bArts = loadArts(data);
        nArts = loadArtsN(data);
        bArtsEx = loadArtsEx(data);
        bladeSkills = loadSkills(data, 1);
        fieldSkills = loadSkills(data, 2);
        extraParts2 = loadGap(data, 0xC0, 4);
        bArtsAchieve = loadAchievInfo(data, 1);
        bSkillsAchieve = loadAchievInfo(data, 2);
        fSKillsAchieve = loadAchievInfo(data, 3);
        keyAchievement = new AchievInfo().fromByteArray(arrayRange(data, 0x5D4, 0x5D4+0x90));
        keyReleaseLevel = load16(data, 0x664);
        favorites = loadFavoriteData(data);
        gap676 = load16(data, 0x676);
        equipOrbs = loadArr16(data, 0x678, 3);
        gap67E = load16(data, 0x67E);
        equipOrbHandles = loadArr32(data, 0x680, 3);
        hanaEquip = new EquipHana().fromByteArray(arrayRange(data, 0x68C, 0x68C+0x7C));
        race = load8(data, 0x708);
        gender = load8(data, 0x709);
        still = load16(data, 0x70A);
        modelResourceName = loadS16(data, 0x70C);
        model2Name = loadS16(data, 0x720);
        motionResourceName = loadS16(data, 0x734);
        motion2Name = loadS16(data, 0x748);
        addMotionName = loadS16(data, 0x75C);
        voiceName = loadS16(data, 0x770);
        clipEvent = loadS16(data, 0x784);
        com_SE = loadS16(data, 0x798);
        effectResourceName = loadS16(data, 0x7AC);
        com_VO = loadS16(data, 0x7C0);
        centerBone = loadS16(data, 0x7DB);
        camBone = loadS16(data, 0x7E8);
        seResourceName = loadS32(data, 0x7FC);
        bladeSize = load8(data, 0x820);
        weaponType = load8(data, 0x821);
        orbNum = load8(data, 0x822);
        atr = load8(data, 0x823);
        personality = load8(data, 0x824);
        extraParts = load8(data, 0x825);
        eyeRot = load8(data, 0x826);
        gap_827 = load8(data, 0x827);
        coolTime = load16(data, 0x828);
        condition = load16(data, 0x82A);
        defWeapon = load16(data, 0x82C);
        chestHeight = load16(data, 0x82E);
        landingHeight = load16(data, 0x830);
        rareNameId = load16(data, 0x832);
        commonNameId = load16(data, 0x834);
        scale = load16(data, 0x836);
        wpnScale = load16(data, 0x838);
        offsetId = load16(data, 0x83A);
        collisionId = load16(data, 0x83C);
        pArmor = load8(data, 0x83E);
        eArmor = load8(data, 0x83F);
        hpMaxRev = load8(data, 0x840);
        strengthRev = load8(data, 0x841);
        powEtherRev = load8(data, 0x842);
        dexRev = load8(data, 0x843);
        agilityRev = load8(data, 0x844);
        luckRev = load8(data, 0x845);
        questRace = load8(data, 0x846);
        releaseLock = load8(data, 0x847);
        footStep = load8(data, 0x848);
        footStepEffect = load8(data, 0x849);
        kitzunaLinkSet = load16(data, 0x84A);
        normalTalk = load16(data, 0x84C);
        gap_84E = load16(data, 0x84E);
        createEventId = load32(data, 0x850);
        mountPoint = load16(data, 0x854);
        mountObject = load16(data, 0x856);
        name = loadGap(data, 0x858, 64);
        nameLength = load32(data, 0x898);
        commonBladeIndex = load16(data, 0x89C);
        enableEngageRex = load8(data, 0x89E);
        bladeReleaseStatus = load8(data, 0x89F);
        isUnselect = load8(data, 0x8A0);
        affinityChartStatus = load8(data, 0x8A1);
        field_8A2 = load16(data, 0x8A2);
        return this;
    }

    private SDataIdea[] loadIdeas(byte[] data) {
        SDataIdea[] res = new SDataIdea[4];
        for(int i = 0; i < 4; i++) {
            res[i] = new SDataIdea().fromByteArray(arrayRange(data, 0xC+0x8*i, 0xC+0x8*(i+1)));
        }
        return res;
    }

    private SDataBladeArts[] loadArts(byte[] data) {
        SDataBladeArts[] res = new SDataBladeArts[3];
        for(int i = 0; i < 3; i++) {
            res[i] = new SDataBladeArts().fromByteArray(arrayRange(data, 0x3C+0xC*i, 0x3C+0xC*(i+1)));
        }
        return res;
    }

    private SDataBladeArtsN[] loadArtsN(byte[] data) {
        SDataBladeArtsN[] res = new SDataBladeArtsN[3];
        for(int i = 0; i < 3; i++) {
            res[i] = new SDataBladeArtsN().fromByteArray(arrayRange(data, 0x60+0xC*i, 0x60+0xC*(i+1)));
        }
        return res;
    }

    private SDataBladeArtsEx[] loadArtsEx(byte[] data) {
        SDataBladeArtsEx[] res = new SDataBladeArtsEx[2];
        for(int i = 0; i < 2; i++) {
            res[i] = new SDataBladeArtsEx().fromByteArray(arrayRange(data, 0x84+0xC*i, 0x84+0xC*(i+1)));
        }
        return res;
    }

    private SDataBladeSkill[] loadSkills(byte[] data, int num) {
        SDataBladeSkill[] res = new SDataBladeSkill[3];
        for(int i = 0; i < 3; i++) {
            res[i] = new SDataBladeSkill().fromByteArray(arrayRange(data, num == 1 ? 0x9C+0x6*i : 0xAE+0x6*i, num == 1 ? 0x9C+0x6*(i+1) : 0xAE+0x6*(i+1)));
        }
        return res;
    }

    private AchievInfo[] loadAchievInfo(byte[] data, int num) {
        AchievInfo[] res = new AchievInfo[3];
        for(int i = 0; i < 3; i++) {
            if(num == 1)
                res[i] = new AchievInfo().fromByteArray(arrayRange(data, 0xC4+0x90*i, 0xC4+0x90*(i+1)));
            else if(num == 2)
                res[i] = new AchievInfo().fromByteArray(arrayRange(data, 0x274+0x90*i, 0x274+0x90*(i+1)));
            else if(num == 3)
                res[i] = new AchievInfo().fromByteArray(arrayRange(data, 0x424+0x90*i, 0x424+0x90*(i+1)));
        }
        return res;
    }

    private FavoriteData[] loadFavoriteData(byte[] data) {
        FavoriteData[] res = new FavoriteData[2];
        for(int i = 0; i < 2; i++) {
            res[i] = new FavoriteData().fromByteArray(arrayRange(data, 0x666+0x8*i, 0x666+0x8*(i+1)));
        }
        return res;
    }

    public Int16 getDataType() {
        return dataType;
    }

    public Int16 getCreator() {
        return creator;
    }

    public Int16 getSetDriver() {
        return setDriver;
    }

    public Int16 getBladeId() {
        return bladeId;
    }

    public Int32 getBornTime() {
        return bornTime;
    }

    public SDataIdea[] getIdeaData() {
        return ideaData;
    }

    public Int32 getTrustPoints() {
        return trustPoints;
    }

    public Int32 getTrustRank() {
        return trustRank;
    }

    public SDataBladeArts[] getbArts() {
        return bArts;
    }

    public SDataBladeArtsN[] getnArts() {
        return nArts;
    }

    public SDataBladeArtsEx[] getbArtsEx() {
        return bArtsEx;
    }

    public SDataBladeSkill[] getBladeSkills() {
        return bladeSkills;
    }

    public SDataBladeSkill[] getFieldSkill() {
        return fieldSkills;
    }

    public Int8[] getExtraParts2() {
        return extraParts2;
    }

    public AchievInfo[] getbArtsAchieve() {
        return bArtsAchieve;
    }

    public AchievInfo[] getbSkillsAchieve() {
        return bSkillsAchieve;
    }

    public AchievInfo[] getfSKillsAchieve() {
        return fSKillsAchieve;
    }

    public AchievInfo getKeyAchievement() {
        return keyAchievement;
    }

    public Int16 getKeyReleaseLevel() {
        return keyReleaseLevel;
    }

    public FavoriteData[] getFavorites() {
        return favorites;
    }

    public Int16[] getEquipOrbs() {
        return equipOrbs;
    }

    public Int32[] getEquipOrbHandles() {
        return equipOrbHandles;
    }

    public EquipHana getHanaEquip() {
        return hanaEquip;
    }

    public Int8 getRace() {
        return race;
    }

    public Int8 getGender() {
        return gender;
    }

    public Int16 getStill() {
        return still;
    }

    public String16 getModelResourceName() {
        return modelResourceName;
    }

    public String16 getModel2Name() {
        return model2Name;
    }

    public String16 getMotionResourceName() {
        return motionResourceName;
    }

    public String16 getMotion2Name() {
        return motion2Name;
    }

    public String16 getAddMotionName() {
        return addMotionName;
    }

    public String16 getVoiceName() {
        return voiceName;
    }

    public String16 getClipEvent() {
        return clipEvent;
    }

    public String16 getCom_SE() {
        return com_SE;
    }

    public String16 getEffectResourceName() {
        return effectResourceName;
    }

    public String16 getCom_VO() {
        return com_VO;
    }

    public String16 getCenterBone() {
        return centerBone;
    }

    public String16 getCamBone() {
        return camBone;
    }

    public String32 getSeResourceName() {
        return seResourceName;
    }

    public Int8 getBladeSize() {
        return bladeSize;
    }

    public Int8 getWeaponType() {
        return weaponType;
    }

    public Int8 getOrbNum() {
        return orbNum;
    }

    public Int8 getAtr() {
        return atr;
    }

    public Int8 getPersonality() {
        return personality;
    }

    public Int8 getExtraParts() {
        return extraParts;
    }

    public Int8 getEyeRot() {
        return eyeRot;
    }

    public Int16 getCoolTime() {
        return coolTime;
    }

    public Int16 getCondition() {
        return condition;
    }

    public Int16 getDefWeapon() {
        return defWeapon;
    }

    public Int16 getChestHeight() {
        return chestHeight;
    }

    public Int16 getLandingHeight() {
        return landingHeight;
    }

    public Int16 getRareNameId() {
        return rareNameId;
    }

    public Int16 getCommonNameId() {
        return commonNameId;
    }

    public Int16 getScale() {
        return scale;
    }

    public Int16 getWpnScale() {
        return wpnScale;
    }

    public Int16 getOffsetId() {
        return offsetId;
    }

    public Int16 getCollisionId() {
        return collisionId;
    }

    public Int8 getpArmor() {
        return pArmor;
    }

    public Int8 geteArmor() {
        return eArmor;
    }

    public Int8 getHpMaxRev() {
        return hpMaxRev;
    }

    public Int8 getStrengthRev() {
        return strengthRev;
    }

    public Int8 getPowEtherRev() {
        return powEtherRev;
    }

    public Int8 getDexRev() {
        return dexRev;
    }

    public Int8 getAgilityRev() {
        return agilityRev;
    }

    public Int8 getLuckRev() {
        return luckRev;
    }

    public Int8 getQuestRace() {
        return questRace;
    }

    public Int8 getReleaseLock() {
        return releaseLock;
    }

    public Int8 getFootStep() {
        return footStep;
    }

    public Int8 getFootStepEffect() {
        return footStepEffect;
    }

    public Int16 getKitzunaLinkSet() {
        return kitzunaLinkSet;
    }

    public Int16 getNormalTalk() {
        return normalTalk;
    }

    public Int32 getCreateEventId() {
        return createEventId;
    }

    public Int16 getMountPoint() {
        return mountPoint;
    }

    public Int16 getMountObject() {
        return mountObject;
    }

    public Int8[] getName() {
        return name;
    }

    public Int32 getNameLength() {
        return nameLength;
    }

    public Int16 getCommonBladeIndex() {
        return commonBladeIndex;
    }

    public Int8 getEnableEngageRex() {
        return enableEngageRex;
    }

    public Int8 getBladeReleaseStatus() {
        return bladeReleaseStatus;
    }

    public Int8 getAffinityChartStatus() {
        return affinityChartStatus;
    }

    public Int8 getIsUnselect() {
        return isUnselect;
    }
}
