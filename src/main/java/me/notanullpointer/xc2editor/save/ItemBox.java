package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.XC2Editor;
import me.notanullpointer.xc2editor.save.parser.Int32;
import me.notanullpointer.xc2editor.save.structure.ItemInfo;

public enum ItemBox {

    PC_WPN_CHIP("Core Chips", 1, 1, XC2Editor.getSaveFile().getItemBox().getPcWpnChipBox()),
    PC_EQUIP("Accessories", 2, 2, XC2Editor.getSaveFile().getItemBox().getPcEquipBox()),
    EQUIP_ORB("Aux Cores", 3, 3, XC2Editor.getSaveFile().getItemBox().getEquipOrbBox()),
    SALVAGE("Cylinders", 4, 5, XC2Editor.getSaveFile().getItemBox().getSalvageBox()),
    PRECIOUS("Key Items", 5, 6, XC2Editor.getSaveFile().getItemBox().getPreciousBox()),
    INFO("Info Items", 6, 14, XC2Editor.getSaveFile().getItemBox().getInfoBox()),
    EVENT("?", 7, 0, XC2Editor.getSaveFile().getItemBox().getEventBox()),
    COLLECTION_LIST("Collectibles", 8, 7, XC2Editor.getSaveFile().getItemBox().getCollectionListBox()),
    TREASURE("Treasure", 9, 8, XC2Editor.getSaveFile().getItemBox().getTreasureBox()),
    EMPTY_ORB("Unrefined Aux Cores", 10, 9, XC2Editor.getSaveFile().getItemBox().getEmptyOrbBox()),
    FAVORITE_BOX("Pouch Items", 11, 10, XC2Editor.getSaveFile().getItemBox().getFavoriteBox()),
    CRYSTAL_LIST("Core Crystals", 12, 11, XC2Editor.getSaveFile().getItemBox().getCrystalListBox()),
    BOOSTER("Boosters", 13, 12, XC2Editor.getSaveFile().getItemBox().getBoosterBox()),
    HANA_ROLE("Role CPU", 14, 16, XC2Editor.getSaveFile().getItemBox().getHanaRoleBox()),
    HANA_ATR("Element Core", 15, 17, XC2Editor.getSaveFile().getItemBox().getHanaAtrBox()),
    HANA_ARTS("Arts Cards", 16, 18, XC2Editor.getSaveFile().getItemBox().getHanaArtsBox()),
    HANA_NARTS("Specials Enhancing RAM", 17, 19, XC2Editor.getSaveFile().getItemBox().getHanaNArtsBox()),
    HANA_ASSIST("Skill RAM", 18, 20, XC2Editor.getSaveFile().getItemBox().getHanaAssistBox());

    private String name;
    private int index;
    private ItemInfo[] box;
    private static Int32[] serials = XC2Editor.getSaveFile().getItemBox().getSerials();
    private int overriddenSlots = 0;
    private int type;

    ItemBox(String name, int index, int type, ItemInfo[] box) {
        this.name = name;
        this.index = index;
        this.box = box;
        this.type = type;
    }

    private int findFreeSlot() {
        for(int i = 0; i < box.length; i++) {
            if(box[i].getCount() == 0) {
                return i;
            }
        }
        return box.length-overriddenSlots++;
    }

    public int addItem(short id, short count) {
        int slot = findFreeSlot();
        ItemInfo info = box[slot];
        info.setId(id);
        info.setCount(count);
        info.setType((byte)type);
        serials[index].setValue(serials[index].getValue()+1);
        info.setSerial(serials[index].getValue());
        return slot;
    }

    public ItemInfo getItemBySerial(int serial) {
        for (ItemInfo info:box) {
            if(info.getSerial() == serial) return info;
        }
        return null;
    }

    public int getItemPositionBySerial(int serial) {
        for (int i = 0; i<box.length; i++) {
            if(box[i].getSerial() == serial) return i;
        }
        return 0;
    }

    public ItemInfo getItem(int index) {
        return box[index];
    }

    public void setItem(int index, ItemInfo info) {
        box[index] = info;
    }

    public void removeItem(int index) {
        ItemInfo info = box[index];
        info.setId((short)0);
        info.setCount((short)0);
        info.setType((byte)type);
        info.setSerial(0);
    }

}
