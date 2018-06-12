package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.*;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;

public class SaveFile {

    public Int32 magic;
    public Int32 ss_field_4;
    public Int64 time;
    public Int32 money;
    public Int32 mapJumpId;
    public Int32 sg_field_8;
    public Int32 sg_field_C;
    public Vec3 mapPosition;
    public Float32 sg_field_1C;
    public Float32 landmarkRotY;
    public Int16 isTimeStop;
    public Int16 chapterSaveScenarioFlag;
    public Int16 chapterSaveEventId;
    public Int16 sg_field_2A;
    public SDataDriver drivers[/*16*/];
    public SDataBlade blades[/*422*/];
    public SDataParty party;
    public SDataItemBox itemBox;
    public GameFlag flags;
    public Int32 scenarioQuest;
    public Int32 currentQuest;
    public Int32 field_1097EC;
    public SDataMap map;
    public Int8 sg_gap_1098B4[/*12*/];
    public Int32 gameTime;
    public Int32 elapseTime;
    public SDataMercenaryTeam data[/*3*/];
    public Int64 mercDataLength;
    public MercenaryTeamPreset mercPresets[/*8*/];
    public Int16 commonBladeIds[/*192*/];
    public Float32 playerCameraDistance;
    public Int32 gameClearCount;
    public TaskAchieve taskData[/*128*/];
    public Int64 taskDataLength;
    public Int32 questIdData[/*256*/];
    public Int32 questIdDataLength;
    public SDataWeather weather[/*64*/];
    public Int32 etherCrystals;
    public Float32 moveDistance;
    public Float32 moveDistanceB;
    public Int32 assurePoint;
    public Int32 assureCount;
    public Int16 rareBladeAppearType;
    public Int16 field_10AD52;
    public Int32 coinCount;
    public Int32 savedEnemyHp[/*3*/];
    public Int32 field_10AD64;
    public Int64 time2;
    public Float32 cameraHeight;
    public Int8 minigame[/*256*/];
    public Float32 cameraYaw;
    public Float32 cameraPitch;
    public Int8 cameraFreeMode;
    public Int8 isHikariCurrent;
    public Int16 autoEventAfterLoad;
    public Int8 isCollectFlagNewVersion;
    public Int8 isEndGameSave;
    public Int8 cameraSide;
    public Int8 gap_10AE83;
    public Event events[/*500*/];
    public Int32 eventsLength;
    public Int8 sg_gap1171D8[/*400*/];
    public Float32 sg_field_117368;
    public Int32 contentVersion[/*5*/];
    public Int8 sg_gap_117380[/*776*/];
    public Int32 sg_field_117688;
    public Int32 sg_field_11768DC;

    public SaveFile(byte[] data) {
        magic = new Int32().fromByteArray(arrayRange(data, 0, 4));
        ss_field_4 = new Int32().fromByteArray(arrayRange(data, 4, 8));
    }

}
