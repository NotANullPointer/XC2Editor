package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;

public enum Weapon {

    AEGIS_SWORD(Image.WPN_AEGIS_SWORD, "Aegis Sword"),
    CATALYST_SCIMITAR(Image.WPN_CATALYST_SCIMITAR, "Catalyst Scimitar"),
    TWIN_RINGS(Image.WPN_TWIN_RINGS, "Twin Rings"),
    DRILL_SHIELD(Image.WPN_DRILL_SHIELD, "Drill Shield"),
    MECH_ARMS(Image.WPN_MECH_ARMS, "Mech Arms"),
    VARIABLE_SABER(Image.WPN_VARIABLE_SABER, "Variable Saber"),
    WHIPSWORDS(Image.WPN_WHIPSWORDS, "Whipswords"),
    BIG_BANG_EDGE(Image.WPN_BIG_BANG_EDGE, "Big Bang Edge"),
    DUAL_SCYTHES(Image.WPN_DUAL_SCYTHES, "Dual Scythes"),
    GREATAXE(Image.WPN_GREATAXE, "Greataxe"),
    MEGALANCE(Image.WPN_MEGALANCE, "Megalance"),
    ETHER_CANNON(Image.WPN_ETHER_CANNON, "Ether Cannon"),
    SHIELD_HAMMER(Image.WPN_SHIELD_HAMMER, "Shield Hammer"),
    CHROMA_KATANA(Image.WPN_CHROMA_KATANA, "Chroma Katana"),
    BITBALL(Image.WPN_BITBALL, "Bitball"),
    KNUCKLE_CLAWS(Image.WPN_KNUCKLE_CLAWS, "Knuckle Claws"),
    BROADSWORD(Image.WPN_BROADSWORD, "Broadsword"),
    CALAMITY_SCYTHE(Image.WPN_CALAMITY_SCYTHE, "Calamity Scythe"),
    COBRA_BARDICHE(Image.WPN_COBRA_BARDICHE, "Cobra Bardiche"),
    INFINITY_FANS(Image.WPN_INFINITY_FANS, "Infinity Fans"),
    BRILLANT_TWINBLADES(Image.WPN_BRILLANT_TWINBLADES, "Brillant Twinblades"),
    DECIMATION_CANNON(Image.WPN_DECIMATION_CANNON, "Decimation Cannon"),
    ROCKRENDING_GAUNTLETS(Image.WPN_ROCKRENDING_GAUNTLETS, "Rockrending Gauntlets"),
    SWORD_TONFA(Image.WPN_SWORD_TONFA, "Sword Tonfa");
    
    
    private Image thumbnail;
    private String name;

    Weapon(Image thumbnail, String name) {
        this.thumbnail = thumbnail;
        this.name = name;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }
    
}
