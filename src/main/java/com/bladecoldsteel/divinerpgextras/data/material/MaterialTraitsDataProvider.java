package com.bladecoldsteel.divinerpgextras.data.material;

import com.bladecoldsteel.divinerpgextras.modifiers.CompatModifiers;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.tools.TinkerModifiers;

public class MaterialTraitsDataProvider extends AbstractMaterialTraitDataProvider {

    public MaterialTraitsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    public String getName() {
        return "DivineRPG Extras Material Traits";
    }

    @Override
    protected void addMaterialTraits() {
        //Overworld
        addDefaultTraits(MaterialIds.aquatic, TinkerModifiers.hydraulic.get());
        addDefaultTraits(MaterialIds.realmite, TinkerModifiers.dwarven.get());
        addDefaultTraits(MaterialIds.arlemite, TinkerModifiers.lightweight.get());
        addDefaultTraits(MaterialIds.rupee, TinkerModifiers.lightweight.get());
        addDefaultTraits(MaterialIds.shadow, TinkerModifiers.momentum.get());
        addDefaultTraits(MaterialIds.jungle, CompatModifiers.POISON.get());
        addDefaultTraits(MaterialIds.terran, TinkerModifiers.cultivated.get());
        addDefaultTraits(MaterialIds.corrupted, CompatModifiers.CORRUPTING.get());
        addDefaultTraits(MaterialIds.divine, CompatModifiers.DIVINEINTERVENTION.get());
        addDefaultTraits(MaterialIds.gray_diamond, TinkerModifiers.wellMaintained.get());
        addDefaultTraits(MaterialIds.blue_diamond, TinkerModifiers.wellMaintained.get());
        addDefaultTraits(MaterialIds.red_diamond, TinkerModifiers.wellMaintained.get());
        addDefaultTraits(MaterialIds.green_diamond, TinkerModifiers.wellMaintained.get());
        addDefaultTraits(MaterialIds.yellow_diamond, TinkerModifiers.wellMaintained.get());
        addDefaultTraits(MaterialIds.cyclops, CompatModifiers.ALLSEEINGEYE.get());
        addDefaultTraits(MaterialIds.crabs, TinkerModifiers.piercing.get());
        addDefaultTraits(MaterialIds.kraken, TinkerModifiers.sturdy.get());
        //Nether
        addDefaultTraits(MaterialIds.bloodgem, TinkerModifiers.necrotic.get());
        addDefaultTraits(MaterialIds.bluefire, CompatModifiers.HELLFIRE.get());
        addDefaultTraits(MaterialIds.molten, TinkerModifiers.autosmelt.get());
        addDefaultTraits(MaterialIds.torridite, TinkerModifiers.fiery.get());
        addDefaultTraits(MaterialIds.hellstone, TinkerModifiers.scorching.get());
        //The End
        addDefaultTraits(MaterialIds.ender, CompatModifiers.INTERPOLATE.get());
        addDefaultTraits(MaterialIds.bedrock, CompatModifiers.EARTHBOUND.get());
        //Eden
        addDefaultTraits(MaterialIds.eden, CompatModifiers.TWILIGHT.get());
        addDefaultTraits(MaterialIds.eden, CompatModifiers.EDENGARDEN.get());
        //The Wildwood
        addDefaultTraits(MaterialIds.wildwood, CompatModifiers.TWILIGHT.get());
        addDefaultTraits(MaterialIds.wildwood, CompatModifiers.WOODY.get());
        //Apalachia
        addDefaultTraits(MaterialIds.apalachia, CompatModifiers.TWILIGHT.get());
        addDefaultTraits(MaterialIds.apalachia, CompatModifiers.DREAMSCAPE.get());
        //Skythern
        addDefaultTraits(MaterialIds.skythern, CompatModifiers.TWILIGHT.get());
        addDefaultTraits(MaterialIds.skythern, CompatModifiers.SKYBOUND.get());
        //Mortum
        addDefaultTraits(MaterialIds.mortum, CompatModifiers.TWILIGHT.get());
        addDefaultTraits(MaterialIds.mortum, TinkerModifiers.insatiable.get());
        //Iceika
        addDefaultTraits(MaterialIds.ice, CompatModifiers.ICY.get());
        //Dungeon of Arcana
        addDefaultTraits(MaterialIds.arcanium, CompatModifiers.MAGICAL.get());
        //Vethea
        addDefaultTraits(MaterialIds.teaker, TinkerModifiers.sturdy.get());
        addDefaultTraits(MaterialIds.amthirmis, CompatModifiers.ARTHRITIS.get());
        addDefaultTraits(MaterialIds.darven, TinkerModifiers.dwarven.get());
        addDefaultTraits(MaterialIds.cermile, TinkerModifiers.cultivated.get());
        addDefaultTraits(MaterialIds.karos, CompatModifiers.SKINFRY.get());
        addDefaultTraits(MaterialIds.pardimal, CompatModifiers.MAGICAL.get());
        addDefaultTraits(MaterialIds.quadrotic, CompatModifiers.MULTIHIT.get());
        addDefaultTraits(MaterialIds.heliosis, CompatModifiers.SKINFRY.get());
        addDefaultTraits(MaterialIds.arksiane, TinkerModifiers.insatiable.get());
        //Awakened Halite
        addDefaultTraits(MaterialIds.awakened_halite, TinkerModifiers.insatiable.get());
        addDefaultTraits(MaterialIds.awakened_halite, CompatModifiers.HIGHERLEVEL.get());
    }

}
