package me.notanullpointer.xc2editor.save.structure;

import me.notanullpointer.xc2editor.save.parser.*;

import static me.notanullpointer.xc2editor.save.parser.Utils.arrayRange;
import static me.notanullpointer.xc2editor.save.parser.Utils.loadArr16;

public class SaveFile {

    private byte[] data;

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
    public SDataMercenaryTeam mercData[/*3*/];
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
        this.data = data;
        magic = load32(0x0);
        ss_field_4 = load32(0x4);
        time = load64(0x8);
        money = load32(0x10);
        mapJumpId = load32(0x14);
        sg_field_8 = load32(0x18);
        sg_field_C = load32(0x1C);
        mapPosition = new Vec3().fromByteArray(arrayRange(data, 0x20, 0x20+0xC));
        sg_field_1C = loadf32(0x2C);
        landmarkRotY = loadf32(0x30);
        isTimeStop = load16(0x34);
        chapterSaveScenarioFlag = load16(0x36);
        chapterSaveEventId = load16(0x38);
        sg_field_2A = load16(0x3A);
        drivers = loadDrivers();
        blades = loadBlades();
        party = new SDataParty().fromByteArray(arrayRange(data, 0xE9894, 0xE9894+0x54));
        itemBox = new SDataItemBox().fromByteArray(arrayRange(data, 0xE98E8, 0xFBBD4));
        commonBladeIds = loadArr16(data, 0x1099B8, 192);
    }

    public SDataBlade findBladeById(short id) {
        for(SDataBlade blade:blades) {
            if(blade.getBladeId().getValue() == id)
                return blade;
        }
        return null;
    }

    private Int64 load64(int addr) {
        return new Int64().fromByteArray(arrayRange(data, addr, addr+8));
    }

    private Int32 load32(int addr) {
        return new Int32().fromByteArray(arrayRange(data, addr, addr+4));
    }

    private Int16 load16(int addr) {
        return new Int16().fromByteArray(arrayRange(data, addr, addr+2));
    }

    private Int8 load8(int addr) {
        return new Int8().fromByteArray(arrayRange(data, addr, addr+1));
    }

    private Float32 loadf32(int addr) {
        return new Float32().fromByteArray(arrayRange(data, addr, addr+4));
    }

    private SDataDriver[] loadDrivers() {
        SDataDriver[] res = new SDataDriver[16];
        for(int i = 0; i<16; i++) {
            res[i] = new SDataDriver().fromByteArray(arrayRange(data, 0x3C+0x5A0*(i), 0x3C+0x5A0*(i+1)));
        }
        return res;
    }

    private SDataBlade[] loadBlades() {
        SDataBlade[] res = new SDataBlade[422];
        for(int i = 0; i < 422; i++) {
            res[i] = new SDataBlade().fromByteArray(arrayRange(data, 0x5A3C+0x8A4*(i), 0x5A3C+0x8A4*(i+1)));
        }
        return res;
    }

    public byte[] getData() {
        return data;
    }

    public Int32 getMagic() {
        return magic;
    }

    public Int64 getTime() {
        return time;
    }

    public Int32 getMoney() {
        return money;
    }

    public Int32 getMapJumpId() {
        return mapJumpId;
    }

    public Vec3 getMapPosition() {
        return mapPosition;
    }

    public Float32 getLandmarkRotY() {
        return landmarkRotY;
    }

    public Int16 getIsTimeStop() {
        return isTimeStop;
    }

    public Int16 getChapterSaveScenarioFlag() {
        return chapterSaveScenarioFlag;
    }

    public Int16 getChapterSaveEventId() {
        return chapterSaveEventId;
    }

    public SDataDriver[] getDrivers() {
        return drivers;
    }

    public SDataBlade[] getBlades() {
        return blades;
    }

    public SDataParty getParty() {
        return party;
    }

    public SDataItemBox getItemBox() {
        return itemBox;
    }

    public GameFlag getFlags() {
        return flags;
    }

    public Int32 getScenarioQuest() {
        return scenarioQuest;
    }

    public Int32 getCurrentQuest() {
        return currentQuest;
    }

    public SDataMap getMap() {
        return map;
    }

    public Int32 getGameTime() {
        return gameTime;
    }

    public Int32 getElapseTime() {
        return elapseTime;
    }

    public SDataMercenaryTeam[] getMercData() {
        return mercData;
    }

    public Int64 getMercDataLength() {
        return mercDataLength;
    }

    public MercenaryTeamPreset[] getMercPresets() {
        return mercPresets;
    }

    public Int16[] getCommonBladeIds() {
        return commonBladeIds;
    }

    public Float32 getPlayerCameraDistance() {
        return playerCameraDistance;
    }

    public Int32 getGameClearCount() {
        return gameClearCount;
    }

    public TaskAchieve[] getTaskData() {
        return taskData;
    }

    public Int64 getTaskDataLength() {
        return taskDataLength;
    }

    public Int32[] getQuestIdData() {
        return questIdData;
    }

    public Int32 getQuestIdDataLength() {
        return questIdDataLength;
    }

    public SDataWeather[] getWeather() {
        return weather;
    }

    public Int32 getEtherCrystals() {
        return etherCrystals;
    }

    public Float32 getMoveDistance() {
        return moveDistance;
    }

    public Float32 getMoveDistanceB() {
        return moveDistanceB;
    }

    public Int32 getAssurePoint() {
        return assurePoint;
    }

    public Int32 getAssureCount() {
        return assureCount;
    }

    public Int16 getRareBladeAppearType() {
        return rareBladeAppearType;
    }

    public Int32 getCoinCount() {
        return coinCount;
    }

    public Int32[] getSavedEnemyHp() {
        return savedEnemyHp;
    }

    public Int64 getTime2() {
        return time2;
    }

    public Float32 getCameraHeight() {
        return cameraHeight;
    }

    public Int8[] getMinigame() {
        return minigame;
    }

    public Float32 getCameraYaw() {
        return cameraYaw;
    }

    public Float32 getCameraPitch() {
        return cameraPitch;
    }

    public Int8 getCameraFreeMode() {
        return cameraFreeMode;
    }

    public Int8 getIsHikariCurrent() {
        return isHikariCurrent;
    }

    public Int16 getAutoEventAfterLoad() {
        return autoEventAfterLoad;
    }

    public Int8 getIsCollectFlagNewVersion() {
        return isCollectFlagNewVersion;
    }

    public Int8 getIsEndGameSave() {
        return isEndGameSave;
    }

    public Int8 getCameraSide() {
        return cameraSide;
    }

    public Event[] getEvents() {
        return events;
    }

    public Int32 getEventsLength() {
        return eventsLength;
    }

    public Int32[] getContentVersion() {
        return contentVersion;
    }
}
