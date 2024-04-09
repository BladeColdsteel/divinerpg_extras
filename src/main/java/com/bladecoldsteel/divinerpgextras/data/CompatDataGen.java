package com.bladecoldsteel.divinerpgextras.data;

import com.bladecoldsteel.divinerpgextras.data.material.MaterialDataProvider;
import com.bladecoldsteel.divinerpgextras.data.material.MaterialStatsDataProvider;
import com.bladecoldsteel.divinerpgextras.data.material.MaterialTraitsDataProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

public class CompatDataGen {

    public CompatDataGen() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    static void gatherData(final GatherDataEvent event) {
        if(event.includeServer()) {
            DataGenerator dataGenerator = event.getGenerator();
            AbstractMaterialDataProvider materials = new MaterialDataProvider(dataGenerator);
            dataGenerator.addProvider(materials);
            dataGenerator.addProvider(new MaterialStatsDataProvider(dataGenerator, materials));
            dataGenerator.addProvider(new MaterialTraitsDataProvider(dataGenerator, materials));
        }
    }

}
