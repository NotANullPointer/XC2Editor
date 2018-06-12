package me.notanullpointer.xc2editor.assets;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.omg.CORBA.PolicyErrorCodeHelper;
import sun.java2d.opengl.GLXSurfaceData;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public enum Image {

    //DRV
    REX,
    NIA,
    TORA,
    VANDHAM,
    MORAG,
    ZEKE,
    MALOS,
    JIN,
    //ITM_CAT
    CORE_CHIP,
    ACCESSORIES,
    AUX_CORE_REFINED,
    CYLINDER,
    KEY,
    COLLECTIBLES,
    TREASURE,
    AUX_CORE_UNREFINED,
    POUCH,
    CORE_CRYSTAL,
    BOOSTER,
    INFO,
    ALL,
    //COLLECTIBLES
    WOOD,
    PLANT,
    FRUIT,
    INSECT,
    FISH,
    MINERAL,
    KEY_ITEM_DROP,
    MECHANICAL_COMPONENT,
    //POUCH
    STAPLE_FOOD,
    VEGGIES,
    MEATS,
    SEAFOOD,
    DESSERTS,
    DRINKS,
    INSTRUMENTS,
    ART,
    LITERATURE,
    BOARD_GAMES,
    COSMETICS,
    TEXTILES,
    //ACCESSORIES
    SHOES,
    HAT,
    VEST,
    CHOCKER,
    BELT,
    BANNER,
    GLOVES,
    CUBE,
    ORB,
    MEDAL,
    //HANA
    ROLE_CPU,
    ELEMENT_CORE,
    SPECIAL_ENHANCING_RAM,
    ARTS_CARD,
    SKILL_RAM,
    SKILL_UPGRADE,
    ENERGY_CONVERTER,
    UNKNOWN,

    //BLD_BASE
    BLADE_BASE,

    //IDEAS
    BRAVERY,
    TRUTH,
    COMPASSION,
    JUSTICE,

    //THUMBNAILS
    REX_T,
    NIA_T,
    ZEKE_T,
    TORA_T,
    MORAG_T,
    VANDHAM_T,
    JIN_T,
    MALOS_T,
    PYRA_T,
    MYTHRA_T,
    HOMURI_T,
    NIAB_T,
    DROMARCH_T,
    POPPI_ALPHA_T,
    POPPI_BETA_T,
    POPPI_GAMMA_T,
    PANDORIA_T,
    BRIGHID_T,
    ROC_T,
    AEGEON_T,
    SEVER_T,
    CRESSIDUS_T,
    PERDIDO_T,
    OBRONA_T,
    GODFREY_T,
    AKHOS_T,
    PERCEVAL_T,
    PATROKA_T,
    FLOREN_T,
    GORG_T,
    BOREAS_T,
    KASANDRA_T,
    PRAXIS_T,
    THEORY_T,
    PERUN_T,
    KORA_T,
    AZAMI_T,
    URSULA_T,
    NEWT_T,
    NIM_T,
    SHEBA_T,
    VESS_T,
    ADENINE_T,
    ELECTRA_T,
    ZENOBIA_T,
    FINCH_T,
    MIKHAIL_T,
    DAGAS_T,
    KOSMOS_T,
    WULFRIC_T,
    PANDORIA_CLEAR_T,
    HERALD_T,
    AGATE_T,
    VALE_T,
    DAHLIA_T,
    MD_REX_T,
    CMALE_1,
    CMALE_2,
    CMALE_3,
    CMALE_4,
    CFEMALE_1,
    CFEMALE_2,
    CFEMALE_3,
    CFEMALE_4,
    CBRUTE_1,
    CBRUTE_2,
    CBRUTE_3,
    CBRUTE_4,
    CANIMAL_1,
    CANIMAL_2,

    //Elements
    ELEM_FIRE,
    ELEM_WATER,
    ELEM_WIND,
    ELEM_EARTH,
    ELEM_ELECTRIC,
    ELEM_ICE,
    ELEM_LIGHT,
    ELEM_DARK,

    //Roles
    ROLE_ATK,
    ROLE_TNK,
    ROLE_HLR,

    //Weapons
    WPN_AEGIS_SWORD,
    WPN_CATALYST_SCIMITAR,
    WPN_TWIN_RINGS,
    WPN_DRILL_SHIELD,
    WPN_MECH_ARMS,
    WPN_VARIABLE_SABER,
    WPN_WHIPSWORDS,
    WPN_BIG_BANG_EDGE,
    WPN_DUAL_SCYTHES,
    WPN_GREATAXE,
    WPN_MEGALANCE,
    WPN_ETHER_CANNON,
    WPN_SHIELD_HAMMER,
    WPN_CHROMA_KATANA,
    WPN_BITBALL,
    WPN_KNUCKLE_CLAWS,
    WPN_BROADSWORD,
    WPN_CALAMITY_SCYTHE,
    WPN_COBRA_BARDICHE,
    WPN_INFINITY_FANS,
    WPN_BRILLANT_TWINBLADES,
    WPN_DECIMATION_CANNON,
    WPN_ROCKRENDING_GAUNTLETS,
    WPN_SWORD_TONFA;


    BufferedImage img;

    public BufferedImage getImage() {
        return img;
    }

    private void setImage(BufferedImage image) {
        this.img = image;
    }

    public static BufferedImage getDrvImage(BufferedImage img, int x, int y) {
        return img.getSubimage(x, y, img.getWidth()/4, img.getHeight()/2);
    }

    public static BufferedImage getItmImage(BufferedImage img, int x, int y) {
        return img.getSubimage(x, y, img.getWidth()/8, img.getHeight()/9);
    }

    public static BufferedImage getIdeaImage(BufferedImage img, int x) {
        return img.getSubimage(x, 0, img.getWidth()/4, img.getHeight());
    }

    public static BufferedImage getThumbImage(BufferedImage img, int column, int row) {
        int thumbWidth = img.getWidth()/8;
        int thumbHeigth = img.getHeight()/12;
        return img.getSubimage(column*thumbWidth, row*thumbHeigth, thumbWidth, thumbHeigth);
    }

    public static BufferedImage getElementImage(BufferedImage img, int column, int row) {
        int elemWidth = img.getWidth()/5;
        int elemHeigth = img.getHeight()/2;
        return img.getSubimage(column*elemWidth, row*elemHeigth, elemWidth, elemHeigth);
    }

    public static BufferedImage getRoleImage(BufferedImage img, int column) {
        int roleWidth = img.getWidth()/3;
        int roleHeigth = img.getHeight();
        return img.getSubimage(column*roleWidth, 0, roleWidth, roleHeigth);
    }

    public static BufferedImage getWeaponImage(BufferedImage img, int column, int row) {
        int weaponWidth = img.getWidth()/5;
        int weaponHeigth = img.getHeight()/6;
        return img.getSubimage(column*weaponWidth, row*weaponHeigth, weaponWidth, weaponHeigth);
    }


    public static void load() throws IOException {
        String loadingPath = System.getProperty("user.home") + "/xc2assets/";

        BufferedImage drivers = ImageIO.read(new File(loadingPath, "drivers.png"));
        int drvHeight = drivers.getData().getHeight()/2;
        int drvWidth = drivers.getData().getWidth()/4;
        REX.setImage(getDrvImage(drivers, 0, 0));
        NIA.setImage(getDrvImage(drivers, drvWidth, 0));
        TORA.setImage(getDrvImage(drivers, drvWidth*2, 0));
        ZEKE.setImage(getDrvImage(drivers, drvWidth*3, 0));
        MORAG.setImage(getDrvImage(drivers, 0, drvHeight));
        VANDHAM.setImage(getDrvImage(drivers, drvWidth, drvHeight));
        JIN.setImage(getDrvImage(drivers, drvWidth*2, drvHeight));
        MALOS.setImage(getDrvImage(drivers, drvWidth*3, drvHeight));

        BufferedImage items = ImageIO.read(new File(loadingPath, "items.png"));
        int itmHeight = items.getData().getHeight()/9;
        int itmWidth = items.getData().getWidth()/8;
        CORE_CHIP.setImage(getItmImage(items, 0, 0));
        ACCESSORIES.setImage(getItmImage(items, itmWidth, 0));
        AUX_CORE_REFINED.setImage(getItmImage(items, itmWidth*2, 0));
        CYLINDER.setImage(getItmImage(items, itmWidth*3, 0));
        KEY.setImage(getItmImage(items, itmWidth*4, 0));
        COLLECTIBLES.setImage(getItmImage(items, itmWidth*5, 0));
        TREASURE.setImage(getItmImage(items, itmWidth*6, 0));
        AUX_CORE_UNREFINED.setImage(getItmImage(items, itmWidth*7, 0));
        POUCH.setImage(getItmImage(items, 0, itmHeight));
        CORE_CRYSTAL.setImage(getItmImage(items, itmWidth, itmHeight));
        BOOSTER.setImage(getItmImage(items, itmWidth*3, itmHeight));
        INFO.setImage(getItmImage(items, itmWidth*4, itmHeight));
        ALL.setImage(getItmImage(items, itmWidth*6, itmHeight));

        WOOD.setImage(getItmImage(items, 0, itmHeight*2));
        PLANT.setImage(getItmImage(items, itmWidth, itmHeight*2));
        FRUIT.setImage(getItmImage(items, itmWidth*2, itmHeight*2));
        INSECT.setImage(getItmImage(items, itmWidth*3, itmHeight*2));
        FISH.setImage(getItmImage(items, itmWidth*4, itmHeight*2));
        MINERAL.setImage(getItmImage(items, itmWidth*5, itmHeight*2));
        KEY_ITEM_DROP.setImage(getItmImage(items, itmWidth*6, itmHeight*2));
        MECHANICAL_COMPONENT.setImage(getItmImage(items, itmWidth*7, itmHeight*2));

        STAPLE_FOOD.setImage(getItmImage(items, 0, itmHeight*3));
        VEGGIES.setImage(getItmImage(items, itmWidth, itmHeight*3));
        MEATS.setImage(getItmImage(items, itmWidth*2, itmHeight*3));
        SEAFOOD.setImage(getItmImage(items, itmWidth*3, itmHeight*3));
        DESSERTS.setImage(getItmImage(items, itmWidth*4, itmHeight*3));
        DRINKS.setImage(getItmImage(items, itmWidth*5, itmHeight*3));
        INSTRUMENTS.setImage(getItmImage(items, itmWidth*6, itmHeight*3));
        ART.setImage(getItmImage(items, itmWidth*7, itmHeight*3));
        LITERATURE.setImage(getItmImage(items, 0, itmHeight*4));
        BOARD_GAMES.setImage(getItmImage(items, itmWidth, itmHeight*4));
        COSMETICS.setImage(getItmImage(items, itmWidth*2, itmHeight*4));
        TEXTILES.setImage(getItmImage(items, itmWidth*3, itmHeight*4));

        SHOES.setImage(getItmImage(items, itmWidth*4, itmHeight*4));
        HAT.setImage(getItmImage(items, itmWidth*5, itmHeight*4));
        VEST.setImage(getItmImage(items, itmWidth*6, itmHeight*4));
        CHOCKER.setImage(getItmImage(items, itmWidth*7, itmHeight*4));
        BELT.setImage(getItmImage(items, 0, itmHeight*5));
        BANNER.setImage(getItmImage(items, itmWidth, itmHeight*5));
        GLOVES.setImage(getItmImage(items, itmWidth*2, itmHeight*5));
        CUBE.setImage(getItmImage(items, itmWidth*3, itmHeight*5));
        ORB.setImage(getItmImage(items, itmWidth*4, itmHeight*5));
        MEDAL.setImage(getItmImage(items, itmWidth*5, itmHeight*5));

        ROLE_CPU.setImage(getItmImage(items, itmWidth*6, itmHeight*5));
        ELEMENT_CORE.setImage(getItmImage(items, itmWidth*7, itmHeight*5));
        SPECIAL_ENHANCING_RAM.setImage(getItmImage(items, 0, itmHeight*6));
        ARTS_CARD.setImage(getItmImage(items, itmWidth, itmHeight*6));
        SKILL_RAM.setImage(getItmImage(items, itmWidth*2, itmHeight*6));
        SKILL_UPGRADE.setImage(getItmImage(items, itmWidth*3, itmHeight*6));
        ENERGY_CONVERTER.setImage(getItmImage(items, itmWidth*4, itmHeight*6));

        UNKNOWN.setImage(getItmImage(items, 0, itmHeight*8));

        BLADE_BASE.setImage(ImageIO.read(new File(loadingPath, "bladebase.png")));

        BufferedImage ideas = ImageIO.read(new File(loadingPath, "ideas.png"));
        int ideaWidth = ideas.getWidth()/4;
        BRAVERY.setImage(getIdeaImage(ideas, 0));
        TRUTH.setImage(getIdeaImage(ideas, ideaWidth));
        COMPASSION.setImage(getIdeaImage(ideas, ideaWidth*2));
        JUSTICE.setImage(getIdeaImage(ideas, ideaWidth*3));

        BufferedImage thumbnails = ImageIO.read(new File(loadingPath, "thumb.png"));
        Image thumbsload[][] = {
                {REX_T, NIA_T, ZEKE_T, TORA_T, MORAG_T, VANDHAM_T, JIN_T, MALOS_T},
                {PYRA_T, MYTHRA_T, HOMURI_T, NIAB_T, DROMARCH_T, POPPI_ALPHA_T, POPPI_BETA_T, POPPI_GAMMA_T},
                {PANDORIA_T, BRIGHID_T, ROC_T, AEGEON_T, SEVER_T, CRESSIDUS_T, PERDIDO_T, OBRONA_T},
                {GODFREY_T, AKHOS_T, PERCEVAL_T, PATROKA_T, FLOREN_T, GORG_T, BOREAS_T, KASANDRA_T},
                {PRAXIS_T, THEORY_T, PERUN_T, KORA_T, AZAMI_T, URSULA_T, NEWT_T, NIM_T},
                {SHEBA_T, VESS_T, ADENINE_T, ELECTRA_T, ZENOBIA_T, FINCH_T, MIKHAIL_T, DAGAS_T},
                {KOSMOS_T, null, null, null, null, null, null, null},
                {CMALE_1, CMALE_2, CMALE_3, CMALE_4, null, null, null, null},
                {CFEMALE_1, CFEMALE_2, CFEMALE_3, CFEMALE_4, null, null, null, null},
                {CBRUTE_1, CBRUTE_2, CBRUTE_3, CBRUTE_4, null, null, null, null},
                {CANIMAL_1, CANIMAL_2, null, WULFRIC_T, PANDORIA_CLEAR_T, HERALD_T, AGATE_T, VALE_T},
                {null, null, MD_REX_T, null, null, DAHLIA_T, null, null}
        };
        for(int row = 0; row < 12; row++) {
            for(int column = 0; column < 8; column++) {
                if(thumbsload[row][column] != null) {
                    thumbsload[row][column].setImage(getThumbImage(thumbnails, column, row));
                }
            }
        }

        BufferedImage elements = ImageIO.read(new File(loadingPath, "elements.png"));
        Image elemload[][] = {
            {null, ELEM_FIRE, ELEM_WATER, ELEM_WIND, ELEM_EARTH},
            {ELEM_ELECTRIC, ELEM_ICE, ELEM_LIGHT, ELEM_DARK, null}
        };
        for(int row = 0; row < 2; row++) {
            for(int column = 0; column < 5; column++) {
                if(elemload[row][column] != null) {
                    elemload[row][column].setImage(getElementImage(elements, column, row));
                }
            }
        }

        BufferedImage roles = ImageIO.read(new File(loadingPath, "roles.png"));
        Image rolesload[] = {ROLE_ATK, ROLE_TNK, ROLE_HLR};
        for(int column = 0; column < 3; column++) {
            rolesload[column].setImage(getRoleImage(roles, column));
        }

        BufferedImage weapons = ImageIO.read(new File(loadingPath, "weapons.png"));
        Image wpnload[][] = {
                {WPN_AEGIS_SWORD, WPN_CATALYST_SCIMITAR, WPN_TWIN_RINGS, WPN_DRILL_SHIELD, WPN_MECH_ARMS},
                {WPN_VARIABLE_SABER, WPN_WHIPSWORDS, WPN_BIG_BANG_EDGE, WPN_DUAL_SCYTHES, WPN_GREATAXE},
                {WPN_MEGALANCE, WPN_ETHER_CANNON, WPN_SHIELD_HAMMER, WPN_CHROMA_KATANA, WPN_BITBALL},
                {WPN_KNUCKLE_CLAWS, WPN_BROADSWORD, null, null, WPN_CALAMITY_SCYTHE},
                {WPN_COBRA_BARDICHE, WPN_INFINITY_FANS, WPN_BRILLANT_TWINBLADES, WPN_DECIMATION_CANNON, WPN_ROCKRENDING_GAUNTLETS},
                {WPN_SWORD_TONFA, null, null, null, null}
        };
        for(int row = 0; row < 6; row++) {
            for(int column = 0; column < 5; column++) {
                if(wpnload[row][column] != null) {
                    wpnload[row][column].setImage(getWeaponImage(weapons, column, row));
                }
            }
        }


    }

}
