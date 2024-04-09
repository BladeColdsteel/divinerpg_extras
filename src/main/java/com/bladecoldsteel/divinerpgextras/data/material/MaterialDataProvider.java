package com.bladecoldsteel.divinerpgextras.data.material;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.OrCondition;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import slimeknights.tconstruct.common.json.ConfigEnabledCondition;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

public class MaterialDataProvider extends AbstractMaterialDataProvider {

    public MaterialDataProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    public String getName() {
        return "DivineRPG Extras Materials";
    }

    @Override
    protected void addMaterials() {
        //Overworld
        addMaterial(MaterialIds.aquatic, 2, ORDER_COMPAT, false, 0x1965e0, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.arlemite, 2, ORDER_COMPAT, false, 0x2bbf26, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.rupee, 2, ORDER_COMPAT, false, 0x1177d1, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.realmite, 2, ORDER_COMPAT, false, 0xc9871c, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.shadow, 3, ORDER_COMPAT, false, 0x242322, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.jungle, 2, ORDER_COMPAT, false, 0x57d13f, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.terran, 2, ORDER_COMPAT, false, 0x369e21, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.corrupted, 3, ORDER_COMPAT, false, 0x3f19a8, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.divine, 3, ORDER_COMPAT, false, 0xc9c71a, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.gray_diamond, 3, ORDER_COMPAT, false, 0x5c5c56, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.blue_diamond, 3, ORDER_COMPAT, false, 0x135d8f, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.red_diamond, 3, ORDER_COMPAT, false, 0xdb0f0f, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.green_diamond, 3, ORDER_COMPAT, false, 0x4eff45, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.yellow_diamond, 3, ORDER_COMPAT, false, 0xf5f12f, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.cyclops, 1, ORDER_COMPAT, true, 0xdbd95c, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.crabs, 1, ORDER_COMPAT, true, 0xb32619, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.kraken, 2, ORDER_COMPAT, true, 0x65889c, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Nether
        addMaterial(MaterialIds.bloodgem, 3, ORDER_COMPAT, false, 0xd60f65, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.bluefire, 3, ORDER_COMPAT, false, 0x2f1cd9, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.molten, 3, ORDER_COMPAT, false, 0xe8371c, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.torridite, 3, ORDER_COMPAT, false, 0xc91010, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.hellstone, 3, ORDER_COMPAT, false, 0x591e0a, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //The End
        addMaterial(MaterialIds.ender, 3, ORDER_COMPAT, false, 0xa505ab, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.bedrock, 3, ORDER_COMPAT, false, 0x19171a, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Eden
        addMaterial(MaterialIds.eden, 3, ORDER_COMPAT, false, 0xd13c17, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //The Wildwood
        addMaterial(MaterialIds.wildwood, 3, ORDER_COMPAT, false, 0x1768d1, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Apalachia
        addMaterial(MaterialIds.apalachia, 4, ORDER_COMPAT, false, 0xa317d1, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Skythern
        addMaterial(MaterialIds.skythern, 4, ORDER_COMPAT, false, 0xa09da1, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Mortum
        addMaterial(MaterialIds.mortum, 4, ORDER_COMPAT, false, 0x1c1c1c, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Iceika
        addMaterial(MaterialIds.ice, 2, ORDER_COMPAT, false, 0x9bcfcd, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Dungeon of Arcana
        addMaterial(MaterialIds.arcanium, 3, ORDER_COMPAT, false, 0x35c4bf7, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));

        //Vethea
        addMaterial(MaterialIds.teaker, 2, ORDER_COMPAT, false, 0x1a0000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.amthirmis, 2, ORDER_COMPAT, false, 0x260000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.darven, 2, ORDER_COMPAT, false, 0x420000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.cermile, 3, ORDER_COMPAT, false, 0x590000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.karos, 3, ORDER_COMPAT, false, 0x700101, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.pardimal, 3, ORDER_COMPAT, false, 0x870000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.quadrotic, 4, ORDER_COMPAT, false, 0xa10000, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.heliosis, 4, ORDER_COMPAT, false, 0xa30d0d, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.arksiane, 4, ORDER_COMPAT, false, 0xd41111, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
        addMaterial(MaterialIds.awakened_halite, 4, ORDER_COMPAT, false, 0xcae8e5, false,
                new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("divinerpg")));
    }
}
