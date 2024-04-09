package com.bladecoldsteel.divinerpgextras.data.material;

import com.bladecoldsteel.divinerpgextras.DivineRPG_Extras;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

public class MaterialIds {
    //Overworld
    public static final MaterialId aquatic = id("aquatic");
    public static final MaterialId arlemite = id("arlemite");
    public static final MaterialId rupee = id("rupee");
    public static final MaterialId realmite = id("realmite");
    public static final MaterialId shadow = id("shadow");
    public static final MaterialId jungle = id("jungle");
    public static final MaterialId terran = id("terran");
    public static final MaterialId corrupted = id("corrupted");
    public static final MaterialId divine = id("divine");
    public static final MaterialId gray_diamond = id("gray_diamond");
    public static final MaterialId blue_diamond = id("blue_diamond");
    public static final MaterialId red_diamond = id("red_diamond");
    public static final MaterialId green_diamond = id("green_diamond");
    public static final MaterialId yellow_diamond = id("yellow_diamond");
    public static final MaterialId cyclops = id("cyclops");
    public static final MaterialId crabs = id("crabs");
    public static final MaterialId kraken = id("kraken");
    //Nether
    public static final MaterialId bloodgem = id("bloodgem");
    public static final MaterialId bluefire = id("bluefire");
    public static final MaterialId molten = id("molten");
    public static final MaterialId torridite = id("torridite");
    public static final MaterialId hellstone = id("hellstone");
    //The End
    public static final MaterialId ender = id("ender");
    public static final MaterialId bedrock = id("bedrock");
    //Eden
    public static final MaterialId eden = id("eden");
    //The Wildwood
    public static final MaterialId wildwood = id("wildwood");
    //Apalachia
    public static final MaterialId apalachia = id("apalachia");
    //Skythern
    public static final MaterialId skythern = id("skythern");
    //Mortum
    public static final MaterialId mortum = id("mortum");
    //Iceika
    public static final MaterialId ice = id("ice");
    //Dungeon of Arcana
    public static final MaterialId arcanium = id("arcanium");
    //Vethea
    public static final MaterialId teaker = id("teaker");
    public static final MaterialId amthirmis = id("amthirmis");
    public static final MaterialId darven = id("darven");
    public static final MaterialId cermile = id("cermile");
    public static final MaterialId karos = id("karos");
    public static final MaterialId pardimal = id("pardimal");
    public static final MaterialId quadrotic = id("quadrotic");
    public static final MaterialId heliosis = id("heliosis");
    public static final MaterialId arksiane = id("arksiane");
    //Extra
    public static final MaterialId awakened_halite = id("awakened_halite.json");

    private static MaterialId id(String string) {
        return new MaterialId(DivineRPG_Extras.MOD_ID, string);
    }
}
