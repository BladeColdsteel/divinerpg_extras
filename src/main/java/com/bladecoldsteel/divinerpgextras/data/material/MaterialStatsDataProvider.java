package com.bladecoldsteel.divinerpgextras.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

public class MaterialStatsDataProvider extends AbstractMaterialStatsDataProvider {

    public MaterialStatsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    public String getName() {
        return "DivineRPG Extras Material Stats";
    }

    @Override
    protected void addMaterialStats() {
        //Overworld
        addMaterialStats(MaterialIds.aquatic,
                new HeadMaterialStats(95, 2.5f, 2, 0.5f),
                new HandleMaterialStats(0.75f, 0.75f, 1.15f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.arlemite,
                new HeadMaterialStats(250, 4.0f, 3, 1.5f),
                new HandleMaterialStats(1.0f, 1.1f, 0.9f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.rupee,
                new HeadMaterialStats(205, 3.0f, 3, 2f),
                new HandleMaterialStats(1.05f, 0.9f, 1.1f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.realmite,
                new HeadMaterialStats(135, 8.5f, 2, 1f),
                new HandleMaterialStats(0.8f, 1.0f, 0.9f, 1.05f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.shadow,
                new HeadMaterialStats(465, 5.5f, 4, 3f),
                new HandleMaterialStats(1.1f, 0.8f, 1.0f, 1.05f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.jungle,
                new HeadMaterialStats(215, 5.0f, 3, 2f),
                new HandleMaterialStats(0.8f, 1.15f, 1.15f, 0.8f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.terran,
                new HeadMaterialStats(235, 4.5f, 2, 2f),
                new HandleMaterialStats(0.9f, 0.9f, 0.9f, 0.9f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.corrupted,
                new HeadMaterialStats(420, 8.5f, 3, 2.5f),
                new HandleMaterialStats(0.75f, 0.75f, 0.75f, 1.5f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.divine,
                new HeadMaterialStats(1500, 18.5f, 7, 3.5f),
                new HandleMaterialStats(1.0f, 1.15f, 0.9f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.gray_diamond,
                new HeadMaterialStats(540, 5.5f, 3, 2.5f),
                new HandleMaterialStats(1.1f, 0.9f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.blue_diamond,
                new HeadMaterialStats(540, 5.5f, 3, 2.5f),
                new HandleMaterialStats(1.1f, 0.9f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.red_diamond,
                new HeadMaterialStats(540, 5.5f, 3, 2.5f),
                new HandleMaterialStats(1.1f, 0.9f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.green_diamond,
                new HeadMaterialStats(540, 5.5f, 3, 2.5f),
                new HandleMaterialStats(1.1f, 0.9f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.yellow_diamond,
                new HeadMaterialStats(540, 5.5f, 3, 2.5f),
                new HandleMaterialStats(1.1f, 0.9f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.cyclops,
                new HeadMaterialStats(265, 3.5f, 1, 1f),
                new HandleMaterialStats(0.8f, 0.8f, 1.15f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.crabs,
                new HeadMaterialStats(295, 2.5f, 1, 0.5f),
                new HandleMaterialStats(1.0f, 1.0f, 0.8f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.kraken,
                new HeadMaterialStats(355, 4.0f, 2, 2f),
                new HandleMaterialStats(0.75f, 0.85f, 0.9f, 1.15f),
                new ExtraMaterialStats());
        //Nether
        addMaterialStats(MaterialIds.bloodgem,
                new HeadMaterialStats(1305, 9.0f, 4, 2f),
                new HandleMaterialStats(1.1f, 0.9f, 1.25f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.bluefire,
                new HeadMaterialStats(1585, 11.5f, 5, 5f),
                new HandleMaterialStats(0.7f, 1.25f, 1.25f, 0.9f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.molten,
                new HeadMaterialStats(835, 8.5f, 3, 2.5f),
                new HandleMaterialStats(1.0f, 1.25f, 0.9f, 1.05f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.torridite,
                new HeadMaterialStats(945, 7.5f, 3, 1.5f),
                new HandleMaterialStats(0.9f, 1.1f, 1.25f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.hellstone,
                new HeadMaterialStats(1135, 8.0f, 4, 2f),
                new HandleMaterialStats(0.8f, 1.2f, 1.0f, 0.95f),
                new ExtraMaterialStats());
        //The End
        addMaterialStats(MaterialIds.ender,
                new HeadMaterialStats(2146, 9.0f, 4, 4.5f),
                new HandleMaterialStats(0.95f, 1.25f, 1.0f, 0.8f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.bedrock,
                new HeadMaterialStats(20000, 3.0f, 5, 3.5f),
                new HandleMaterialStats(1.25f, 0.75f, 0.75f, 1.05f),
                new ExtraMaterialStats());
        //Eden
        addMaterialStats(MaterialIds.eden,
                new HeadMaterialStats(5000, 20.0f, 6, 5f),
                new HandleMaterialStats(1.15f, 1.2f, 0.8f, 0.9f),
                new ExtraMaterialStats());
        //The Wildwood
        addMaterialStats(MaterialIds.wildwood,
                new HeadMaterialStats(7000, 28.0f, 7, 7f),
                new HandleMaterialStats(1.1f, 0.95f, 0.95f, 1.05f),
                new ExtraMaterialStats());
        //Apalachia
        addMaterialStats(MaterialIds.apalachia,
                new HeadMaterialStats(8500, 40.0f, 8, 9f),
                new HandleMaterialStats(0.75f, 1.1f, 1.25f, 1.0f),
                new ExtraMaterialStats());
        //Skythern
        addMaterialStats(MaterialIds.skythern,
                new HeadMaterialStats(10000, 48.0f, 9, 11f),
                new HandleMaterialStats(1.25f, 0.9f, 1.0f, 0.95f),
                new ExtraMaterialStats());
        //Mortum
        addMaterialStats(MaterialIds.mortum,
                new HeadMaterialStats(15000, 55.0f, 10, 13f),
                new HandleMaterialStats(0.95f, 1.0f, 0.85f, 1.25f),
                new ExtraMaterialStats());
        //Iceika
        addMaterialStats(MaterialIds.ice,
                new HeadMaterialStats(150, 4.5f, 3, 2.5f),
                new HandleMaterialStats(0.75f, 1.15f, 1.25f, 0.85f),
                new ExtraMaterialStats());
        //Dungeon of Arcana
        addMaterialStats(MaterialIds.arcanium,
                new HeadMaterialStats(95, 4.0f, 3, 10f),
                new HandleMaterialStats(1.05f, 1.1f, 1.0f, 1.05f),
                new ExtraMaterialStats());
        //Vethea
        addMaterialStats(MaterialIds.teaker,
                new HeadMaterialStats(135, 47.25f, 1, 1f),
                new HandleMaterialStats(0.9f, 0.65f, 1.0f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.amthirmis,
                new HeadMaterialStats(275, 40.5f, 2, 2.5f),
                new HandleMaterialStats(1.0f, 0.9f, 1.05f, 0.75f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.darven,
                new HeadMaterialStats(536, 32.0f, 3, 4f),
                new HandleMaterialStats(1.1f, 1.25f, 1.1f, 0.8f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.cermile,
                new HeadMaterialStats(1020, 25.25f, 4, 5.5f),
                new HandleMaterialStats(1.2f, 1.05f, 1.15f, 0.95f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.karos,
                new HeadMaterialStats(3425, 9.0f, 7, 10f),
                new HandleMaterialStats(1.15f, 1.15f, 1.35f, 1.0f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.pardimal,
                new HeadMaterialStats(1756, 15.5f, 5, 7f),
                new HandleMaterialStats(1.05f, 1.05f, 1.15f, 1.05f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.quadrotic,
                new HeadMaterialStats(2655, 11.0f, 6, 9.5f),
                new HandleMaterialStats(0.95f, 1.1f, 1.0f, 1.15f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.heliosis,
                new HeadMaterialStats(4305, 6.25f, 8, 11.5f),
                new HandleMaterialStats(0.85f, 1.15f, 1.05f, 1.5f),
                new ExtraMaterialStats());
        addMaterialStats(MaterialIds.arksiane,
                new HeadMaterialStats(5655, 3.5f, 9, 13f),
                new HandleMaterialStats(0.75f, 1.1f, 0.95f, 0.6f),
                new ExtraMaterialStats());
        //Extra
        addMaterialStats(MaterialIds.awakened_halite,
                new HeadMaterialStats(250000, 60.0f, 11, 20f),
                new HandleMaterialStats(0.75f, 0.5f, 0.5f, 1.15f),
                new ExtraMaterialStats());
    }
}
