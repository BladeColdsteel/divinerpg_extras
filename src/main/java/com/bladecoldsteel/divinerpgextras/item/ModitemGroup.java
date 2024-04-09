package com.bladecoldsteel.divinerpgextras.item;

import com.bladecoldsteel.divinerpgextras.init.CompatItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModitemGroup {

    public static final ItemGroup DIVINERPG_EXTRAS_MATERIALS = new ItemGroup("divinerpg_extrasMaterials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CompatItems.AWAKENED_HALITE_INGOT.get());
        }
    };

}
