package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Weapon {

    AEGIS_SWORD(1, "Aegis Sword", Image.WPN_AEGIS_SWORD, Role.ATK),
    CATALYST_SCIMITAR(2, "Catalyst Scimitar", Image.WPN_CATALYST_SCIMITAR, Role.HLR),
    TWIN_RINGS(3, "Twin Rings", Image.WPN_TWIN_RINGS, Role.HLR),
    DRILL_SHIELD(4, "Drill Shield", Image.WPN_DRILL_SHIELD, Role.TNK),
    MECH_ARMS(5, "Mech Arms", Image.WPN_MECH_ARMS, Role.TNK),
    VARIABLE_SABER(6, "Variable Saber", Image.WPN_VARIABLE_SABER, Role.TNK),
    WHIPSWORDS(7, "Whipswords", Image.WPN_WHIPSWORDS, Role.TNK),
    BIG_BANG_EDGE(8, "Big Bang Edge", Image.WPN_BIG_BANG_EDGE, Role.ATK),
    DUAL_SCYTHES(9, "Dual Scythes", Image.WPN_DUAL_SCYTHES, Role.ATK),
    GREATAXE(10, "Greataxe", Image.WPN_GREATAXE, Role.ATK),
    MEGALANCE(11, "Megalance", Image.WPN_MEGALANCE, Role.ATK),
    ETHER_CANNON(12, "Ether Cannon", Image.WPN_ETHER_CANNON, Role.ATK),
    SHIELD_HAMMER(13, "Shield Hammer", Image.WPN_SHIELD_HAMMER, Role.TNK),
    CHROMA_KATANA(14, "Chroma Katana", Image.WPN_CHROMA_KATANA, Role.TNK),
    BITBALL(15, "Bitball", Image.WPN_BITBALL, Role.HLR),
    KNUCKLE_CLAWS(16, "Knuckle Claws", Image.WPN_KNUCKLE_CLAWS, Role.HLR),
    BROADSWORD(17, "Broadsword", Image.WPN_BROADSWORD, Role.ATK),
    NODACHI(18, "Nodachi", Image.UNKNOWN, Role.ATK),
    SWORD_TONFA(19, "Sword Tonfa", Image.WPN_SWORD_TONFA, Role.TNK),
    CALAMITY_SCYTHE(20, "Calamity Scythe", Image.WPN_CALAMITY_SCYTHE, Role.HLR),
    COBRA_BARDICHE(21, "Cobra Bardiche", Image.WPN_COBRA_BARDICHE, Role.ATK),
    INFINITY_FANS(22, "Infinity Fans", Image.WPN_INFINITY_FANS, Role.TNK),
    BRILLIANT_TWINBLADES(23, "Brilliant Twinblades", Image.WPN_BRILLIANT_TWINBLADES, Role.ATK),
    DECIMATION_CANNON(24, "Decimation Cannon", Image.WPN_DECIMATION_CANNON, Role.ATK),
    ROCKRENDING_GAUNTLETS(25, "Rockrending Gauntlets", Image.WPN_ROCKRENDING_GAUNTLETS, Role.TNK),
    SWORD_TONFA_2(26, "Sword Tonfa", Image.WPN_SWORD_TONFA, Role.TNK),
    MONADO(33, "Monado", Image.WPN_MONADO, Role.ATK),
    KNIVES(34, "Knives", Image.WPN_KNIVES, Role.HLR);
    
    
    private Image thumbnail;
    private String name;
    private int id;
    private Role role;

    Weapon(int id, String name, Image thumbnail, Role role) {
        this.thumbnail = thumbnail;
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }

    public static Weapon fromId(int id) {
        for (Weapon wpn:values()) {
            if(wpn.getId() == id) {
                return wpn;
            }
        }
        return null;
    }
}
