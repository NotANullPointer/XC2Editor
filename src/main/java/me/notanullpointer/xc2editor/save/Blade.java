package me.notanullpointer.xc2editor.save;

import me.notanullpointer.xc2editor.assets.Image;
import me.notanullpointer.xc2editor.save.parser.EnumBuster;
import me.notanullpointer.xc2editor.save.structure.SDataBlade;
public enum Blade {

    PYRA(1001, Image.PYRA_T, "Pyra", Element.FIRE, Role.ATK, Weapon.AEGIS_SWORD),
    MYTHRA(1002, Image.MYTHRA_T, "Mythra", Element.LIGHT, Role.ATK, Weapon.AEGIS_SWORD),
    HOMURI(1003, Image.HOMURI_T, "Pneuma", Element.LIGHT, Role.ATK, Weapon.AEGIS_SWORD),
    DROMARCH(1004, Image.DROMARCH_T, "Dromarch", Element.WATER, Role.HLR, Weapon.TWIN_RINGS),
    POPPI_ALPHA(1005, Image.POPPI_ALPHA_T, "Poppi α", Element.EARTH, Role.TNK, Weapon.DRILL_SHIELD),
    POPPI_QT(1006, Image.POPPI_BETA_T, "Poppi QT", Element.FIRE, Role.TNK, Weapon.MECH_ARMS),
    POPPI_QTPI(1007, Image.POPPI_GAMMA_T, "Poppi QTπ", Element.ICE, Role.ATK, Weapon.VARIABLE_SABER),
    ROC(1008, Image.ROC_T, "Roc", Element.WIND, Role.ATK, Weapon.DUAL_SCYTHES),
    BRIGHID(1009, Image.BRIGHID_T, "Brighid", Element.FIRE, Role.TNK, Weapon.WHIPSWORDS),
    PANDORIA(1010, Image.PANDORIA_T, "Pandoria", Element.ELECTRIC, Role.ATK, Weapon.BIG_BANG_EDGE),
    NIA(1011, Image.NIAB_T, "Nia", Element.WATER, Role.HLR, Weapon.CATALYST_SCIMITAR),
    AEGEON(1014, Image.AEGEON_T, "Aegeon", Element.WATER, Role.TNK, Weapon.CHROMA_KATANA),
    GODFREY(1015, Image.GODFREY_T, "Godfrey", Element.ICE, Role.TNK, Weapon.SHIELD_HAMMER),
    WULFRIC(1016, Image.WULFRIC_T, "Wulfric", Element.EARTH, Role.ATK, Weapon.MEGALANCE),
    PERCEVAL(1017, Image.PERCEVAL_T, "Perceval", Element.DARK, Role.TNK, Weapon.CHROMA_KATANA),
    VALE(1018, Image.VALE_T, "Vale", Element.DARK, Role.ATK, Weapon.MEGALANCE),
    AGATE(1019, Image.AGATE_T, "Agate", Element.EARTH, Role.ATK, Weapon.GREATAXE),
    GORG(1020, Image.GORG_T, "Gorg", Element.WATER, Role.ATK, Weapon.GREATAXE),
    BOREAS(1021, Image.BOREAS_T, "Boreas", Element.WIND, Role.HLR, Weapon.BITBALL),
    DAGAS(1022, Image.DAGAS_T, "Dagas", Element.FIRE, Role.ATK, Weapon.GREATAXE),
    KASANDRA(1023, Image.KASANDRA_T, "Kasandra", Element.DARK, Role.TNK, Weapon.SHIELD_HAMMER),
    PRAXIS(1024, Image.PRAXIS_T, "Praxis", Element.WATER, Role.ATK, Weapon.MEGALANCE),
    THEORY(1025, Image.THEORY_T, "Theory", Element.ICE, Role.TNK, Weapon.CHROMA_KATANA),
    PERUN(1026, Image.PERUN_T, "Perun", Element.ICE, Role.ATK, Weapon.MEGALANCE),
    KORA(1027, Image.KORA_T, "Kora", Element.ELECTRIC, Role.HLR, Weapon.KNUCKLE_CLAWS),
    AZAMI(1028, Image.AZAMI_T, "Azami", Element.DARK, Role.ATK, Weapon.ETHER_CANNON),
    URSULA(1029, Image.URSULA_T, "Ursula", Element.ICE, Role.HLR, Weapon.KNUCKLE_CLAWS),
    NEWT(1030, Image.NEWT_T, "Newt", Element.FIRE, Role.TNK, Weapon.CHROMA_KATANA),
    NIM(1031, Image.NIM_T, "Nim", Element.EARTH, Role.HLR, Weapon.KNUCKLE_CLAWS),
    SHEBA(1032, Image.SHEBA_T, "Sheba", Element.WATER, Role.ATK, Weapon.ETHER_CANNON),
    VESS(1033, Image.VESS_T, "Vess", Element.ELECTRIC, Role.HLR, Weapon.BITBALL),
    ADENINE(1034, Image.ADENINE_T, "Adenine", Element.WIND, Role.HLR, Weapon.KNUCKLE_CLAWS),
    ELECTRA(1035, Image.ELECTRA_T, "Electra", Element.ELECTRIC, Role.TNK, Weapon.SHIELD_HAMMER),
    ZENOBIA(1036, Image.ZENOBIA_T, "Zenobia", Element.WIND, Role.ATK, Weapon.GREATAXE),
    FINCH(1037, Image.FINCH_T, "Finch", Element.WIND, Role.TNK, Weapon.SHIELD_HAMMER),
    FLOREN(1038, Image.FLOREN_T, "Floren", Element.EARTH, Role.HLR, Weapon.BITBALL),
    KOSMOS(1039, Image.KOSMOS_T, "KOS-MOS", Element.LIGHT, Role.ATK, Weapon.ETHER_CANNON),
    HERALD(1040, Image.HERALD_T, "Herald", Element.ELECTRIC, Role.ATK, Weapon.ETHER_CANNON),
    DAHLIA(1041, Image.DAHLIA_T, "Dahlia", Element.ICE, Role.HLR, Weapon.BITBALL),
    SEVER_MALOS(1042, Image.SEVER_T, "Sever", Element.WIND, Role.TNK, Weapon.SWORD_TONFA),
    AKHOS(1043, Image.AKHOS_T, "Akhos", Element.ELECTRIC, Role.HLR, Weapon.CALAMITY_SCYTHE),
    PATROKA(1044, Image.PATROKA_T, "Patroka", Element.EARTH, Role.ATK, Weapon.COBRA_BARDICHE),
    MIKHAIL(1045, Image.MIKHAIL_T, "Mikhail", Element.DARK, Role.TNK, Weapon.INFINITY_FANS),
    OBRONA(1046, Image.OBRONA_T, "Obrona", Element.ELECTRIC, Role.ATK, Weapon.BRILLIANT_TWINBLADES),
    PERDIDO(1047, Image.PERDIDO_T, "Perdido", Element.FIRE, Role.ATK, Weapon.DECIMATION_CANNON),
    CRESSIDUS(1048, Image.CRESSIDUS_T, "Cressidus", Element.EARTH, Role.TNK, Weapon.ROCKRENDING_GAUNTLETS),
    SEVER(1049, Image.SEVER_T, "Sever", Element.WIND, Role.TNK, Weapon.SWORD_TONFA_2),
    DAGAS_TRUE(1050, Image.DAGAS_T, "Dagas", Element.FIRE, Role.ATK, Weapon.GREATAXE),
    T_ELOS(1104, Image.T_ELOS_T, "T-elos", Element.DARK, Role.ATK, Weapon.GREATAXE),
    POPPIBUSTER(1105, Image.POPPIBUSTER_T, "Poppibuster", Element.LIGHT, Role.TNK, Weapon.SHIELD_HAMMER),
    SHULK(1106, Image.SHULK_T, "Shulk", Element.LIGHT, Role.ATK, Weapon.MONADO),
    FIORA(1107, Image.FIORA_T, "Fiora", Element.WIND, Role.HLR, Weapon.KNIVES);

    private static EnumBuster<Blade> buster = new EnumBuster<>(Blade.class);

    int id;
    Image thumb;
    String name;
    Element element;
    Role role;
    Weapon weapon;
    SDataBlade blade;

    Blade(int id, Image thumb, String name, Element element, Role role, Weapon weapon) {
        this.id = id;
        this.thumb = thumb;
        this.name = name;
        this.element = element;
        this.role = role;
        this.weapon = weapon;
    }

    private void initialize(int id, Image thumb, String name, Element element, Role role, Weapon weapon) {
        this.id = id;
        this.thumb = thumb;
        this.name = name;
        this.element = element;
        this.role = role;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public Image getThumbnail() {
        return thumb;
    }

    public String getName() {
        return name;
    }

    public Element getElement() {
        return element;
    }

    public Role getRole() {
        return role;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public static void registerRares() {
        for (Blade b:values()) {
            int id = b.getData().getBladeId().getValue();
            if(b.getData().getCreator().getValue() == 0 && b != POPPIBUSTER && b != SHULK &&  b != FIORA) {
                buster.deleteByValue(b);
            }
        }
    }

    public static Blade getCommon(SDataBlade blade) {
        String resName = blade.getSeResourceName().toString();
        String[] resArgs =  resName.split("_");
        int id = blade.getBladeId().getValue();
        int race = Integer.valueOf(resArgs[4]);
        short nameId = blade.getCommonNameId().getValue();
        Weapon wpn = Weapon.fromId(blade.getWeaponType().getValue());
        Image img = null;
        switch(resArgs[3]) {
            case "normal":
                img = getCommonNormalImg(race);
                break;
            case "strong" :
                img = getCommonBruteImg(race);
                break;
            case "female":
                img = getCommonFemaleImg(race);
                break;
            case "animal":
                img = getCommonAnimalImg(race);
                break;
        }
        Class[] paramsType = {int.class, Image.class, String.class, Element.class, Role.class, Weapon.class};
        Object[] params = {id, img, BladeName.fromId(nameId).getName(), Element.fromId(blade.getAtr().getValue()), wpn.getRole(), wpn};
        Blade common = buster.make("CB" + id, 0, paramsType, params);
        common.linkTo(blade);
        buster.addByValue(common);
        return common;
    }

    private static Image getCommonNormalImg(int id) {
        switch (id) {
            //STUB
            default: return Image.CMALE_1;
        }
    }

    private static Image getCommonBruteImg(int id) {
        switch (id) {
            //STUB
            default: return Image.CBRUTE_1;
        }
    }

    private static Image getCommonFemaleImg(int id) {
        switch (id) {
            //STUB
            default: return Image.CFEMALE_1;
        }
    }

    private static Image getCommonAnimalImg(int id) {
        switch (id) {
            //STUB
            default: return Image.CANIMAL_1;
        }
    }

    public void linkTo(SDataBlade blade) {
        this.blade = blade;
    }

    public SDataBlade getData() {
        return blade;
    }

    public static Blade fromId(int id) {
        for (Blade b:values()) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
