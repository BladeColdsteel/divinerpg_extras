package com.bladecoldsteel.divinerpgextras.init;

import com.bladecoldsteel.divinerpgextras.DivineRPG_Extras;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.shared.TinkerCommons;

import static com.bladecoldsteel.divinerpgextras.item.ModitemGroup.DIVINERPG_EXTRAS_MATERIALS;

public class CompatItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DivineRPG_Extras.MOD_ID);

    //Awakened Halite
    public static final RegistryObject<Item> AWAKENED_HALITE_BLOCK = ITEMS.register("awakened_halite_block",
            () -> new BlockItem(CompatBlocks.AWAKENED_HALITE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS).fireResistant()));
    public static final RegistryObject<Item> AWAKENED_HALITE_INGOT = ITEMS.register("awakened_halite_ingot",
            () -> new Item(new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS).fireResistant()));
    public static final RegistryObject<Item> AWAKENED_HALITE_NUGGET = ITEMS.register("awakened_halite_nugget",
            () -> new Item(new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS).fireResistant()));
        public static final RegistryObject<Item> AWAKENED_HALITE_BUCKET = ITEMS.register("awakened_halite_bucket",
                () -> new BucketItem(CompatFluids.AWAKENED_HALITE, new Item.Properties().stacksTo(1).tab(DIVINERPG_EXTRAS_MATERIALS)));

    //Overworld
    public static final RegistryObject<Item> AQUATIC_BLOCK = ITEMS.register("aquatic_block",
            () -> new BlockItem(CompatBlocks.AQUATIC_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> AQUATIC_BUCKET = ITEMS.register("aquatic_bucket",
            () -> new BucketItem(CompatFluids.AQUATIC, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHADOW_BLOCK = ITEMS.register("shadow_block",
            () -> new BlockItem(CompatBlocks.SHADOW_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> SHADOW_BUCKET = ITEMS.register("shadow_bucket",
            () -> new BucketItem(CompatFluids.SHADOW, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JUNGLE_STONE_BLOCK = ITEMS.register("jungle_stone_block",
            () -> new BlockItem(CompatBlocks.JUNGLE_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> JUNGLE_STONE_BUCKET = ITEMS.register("jungle_stone_bucket",
            () -> new BucketItem(CompatFluids.JUNGLE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TERRAN_STONE_BLOCK = ITEMS.register("terran_stone_block",
            () -> new BlockItem(CompatBlocks.TERRAN_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> TERRAN_BUCKET = ITEMS.register("terran_stone_bucket",
            () -> new BucketItem(CompatFluids.TERRAN, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CORRUPTED_STONE_BLOCK = ITEMS.register("corrupted_stone_block",
            () -> new BlockItem(CompatBlocks.CORRUPTED_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> CORRUPTED_BUCKET = ITEMS.register("corrupted_stone_bucket",
            () -> new BucketItem(CompatFluids.CORRUPTED, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRAY_DIAMOND_BLOCK = ITEMS.register("gray_diamond_block",
            () -> new BlockItem(CompatBlocks.GRAY_DIAMOND_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> GRAY_DIAMOND_BUCKET = ITEMS.register("gray_diamond_bucket",
            () -> new BucketItem(CompatFluids.GRAY_DIAMOND, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLUE_DIAMOND_BLOCK = ITEMS.register("blue_diamond_block",
            () -> new BlockItem(CompatBlocks.BLUE_DIAMOND_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> BLUE_DIAMOND_BUCKET = ITEMS.register("blue_diamond_bucket",
            () -> new BucketItem(CompatFluids.BLUE_DIAMOND, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RED_DIAMOND_BLOCK = ITEMS.register("red_diamond_block",
            () -> new BlockItem(CompatBlocks.RED_DIAMOND_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> RED_DIAMOND_BUCKET = ITEMS.register("red_diamond_bucket",
            () -> new BucketItem(CompatFluids.RED_DIAMOND, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREEN_DIAMOND_BLOCK = ITEMS.register("green_diamond_block",
            () -> new BlockItem(CompatBlocks.GREEN_DIAMOND_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> GREEN_DIAMOND_BUCKET = ITEMS.register("green_diamond_bucket",
            () -> new BucketItem(CompatFluids.GREEN_DIAMOND, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_DIAMOND_BLOCK = ITEMS.register("yellow_diamond_block",
            () -> new BlockItem(CompatBlocks.YELLOW_DIAMOND_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> YELLOW_DIAMOND_BUCKET = ITEMS.register("yellow_diamond_bucket",
            () -> new BucketItem(CompatFluids.YELLOW_DIAMOND, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DIVINE_STONE_BLOCK = ITEMS.register("divine_stone_block",
            () -> new BlockItem(CompatBlocks.DIVINE_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> DIVINE_BUCKET = ITEMS.register("divine_stone_bucket",
            () -> new BucketItem(CompatFluids.DIVINE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> REALMITE_BUCKET = ITEMS.register("realmite_bucket",
            () -> new BucketItem(CompatFluids.REALMITE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUPEE_BUCKET = ITEMS.register("rupee_bucket",
            () -> new BucketItem(CompatFluids.RUPEE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ARLEMITE_BUCKET = ITEMS.register("arlemite_bucket",
            () -> new BucketItem(CompatFluids.ARLEMITE, new Item.Properties().stacksTo(1)));

    //The Nether
    public static final RegistryObject<Item> BLOODGEM_BUCKET = ITEMS.register("bloodgem_bucket",
            () -> new BucketItem(CompatFluids.BLOODGEM, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HELLSTONE_BLOCK = ITEMS.register("hellstone_block",
            () -> new BlockItem(CompatBlocks.HELLSTONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> HELLSTONE_BUCKET = ITEMS.register("hellstone_bucket",
            () -> new BucketItem(CompatFluids.HELLSTONE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLUEFIRE_STONE_BLOCK = ITEMS.register("bluefire_stone_block",
            () -> new BlockItem(CompatBlocks.BLUEFIRE_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> BLUEFIRE_BUCKET = ITEMS.register("bluefire_stone_bucket",
            () -> new BucketItem(CompatFluids.BLUEFIRE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_STONE_BLOCK = ITEMS.register("molten_stone_block",
            () -> new BlockItem(CompatBlocks.MOLTEN_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> MOLTEN_STONE_BUCKET = ITEMS.register("molten_stone_bucket",
            () -> new BucketItem(CompatFluids.MOLTEN_STONE, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> TORRIDITE_BUCKET = ITEMS.register("torridite_bucket",
            () -> new BucketItem(CompatFluids.TORRIDITE, new Item.Properties().stacksTo(1)));

    //The End
    public static final RegistryObject<Item> ENDER_STONE_BLOCK = ITEMS.register("ender_stone_block",
            () -> new BlockItem(CompatBlocks.ENDER_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> ENDER_BUCKET = ITEMS.register("ender_stone_bucket",
            () -> new BucketItem(CompatFluids.ENDER, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BEDROCK_CHUNK_BLOCK = ITEMS.register("bedrock_chunk_block",
            () -> new BlockItem(CompatBlocks.BEDROCK_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> BEDROCK_CHUNK_BUCKET = ITEMS.register("bedrock_chunk_bucket",
            () -> new BucketItem(CompatFluids.BEDROCK_CHUNK, new Item.Properties().stacksTo(1)));
    //Twilight Dimensions
    public static final RegistryObject<Item> EDEN_CHUNK_BLOCK = ITEMS.register("eden_chunk_block",
            () -> new BlockItem(CompatBlocks.EDEN_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> EDEN_CHUNK_BUCKET = ITEMS.register("eden_chunk_bucket",
            () -> new BucketItem(CompatFluids.EDEN_CHUNK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WILDWOOD_CHUNK_BLOCK = ITEMS.register("wildwood_chunk_block",
            () -> new BlockItem(CompatBlocks.WILDWOOD_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> WILDWOOD_CHUNK_BUCKET = ITEMS.register("wildwood_chunk_bucket",
            () -> new BucketItem(CompatFluids.WILDWOOD_CHUNK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> APALACHIA_CHUNK_BLOCK = ITEMS.register("apalachia_chunk_block",
            () -> new BlockItem(CompatBlocks.APALACHIA_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> APALACHIA_CHUNK_BUCKET = ITEMS.register("apalachia_chunk_bucket",
            () -> new BucketItem(CompatFluids.APALACHIA_CHUNK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SKYTHERN_CHUNK_BLOCK = ITEMS.register("skythern_chunk_block",
            () -> new BlockItem(CompatBlocks.SKYTHERN_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> SKYTHERN_CHUNK_BUCKET = ITEMS.register("skythern_chunk_bucket",
            () -> new BucketItem(CompatFluids.SKYTHERN_CHUNK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MORTUM_CHUNK_BLOCK = ITEMS.register("mortum_chunk_block",
            () -> new BlockItem(CompatBlocks.MORTUM_CHUNK_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> MORTUM_CHUNK_BUCKET = ITEMS.register("mortum_chunk_bucket",
            () -> new BucketItem(CompatFluids.MORTUM_CHUNK, new Item.Properties().stacksTo(1)));
    //Iceika
    public static final RegistryObject<Item> ICE_STONE_BLOCK = ITEMS.register("ice_stone_block",
            () -> new BlockItem(CompatBlocks.ICE_STONE_BLOCK.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
        public static final RegistryObject<Item> ICE_STONE_BUCKET = ITEMS.register("ice_stone_bucket",
            () -> new BucketItem(CompatFluids.ICE_STONE, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> ARCANIUM_BUCKET = ITEMS.register("arcanium_bucket",
            () -> new BucketItem(CompatFluids.ARCANIUM, new Item.Properties().stacksTo(1)));
    //Vethea
        public static final RegistryObject<Item> TEAKER_BUCKET = ITEMS.register("teaker_bucket",
            () -> new BucketItem(CompatFluids.TEAKER, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> AMTHIRMIS_BUCKET = ITEMS.register("amthirmis_bucket",
            () -> new BucketItem(CompatFluids.AMTHIRMIS, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> DARVEN_BUCKET = ITEMS.register("darven_bucket",
            () -> new BucketItem(CompatFluids.DARVEN, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> CERMILE_BUCKET = ITEMS.register("cermile_bucket",
            () -> new BucketItem(CompatFluids.CERMILE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KAROS_BUCKET = ITEMS.register("karos_bucket",
            () -> new BucketItem(CompatFluids.KAROS, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> PARDIMAL_BUCKET = ITEMS.register("pardimal_bucket",
            () -> new BucketItem(CompatFluids.PARDIMAL, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> QUADROTIC_BUCKET = ITEMS.register("quadrotic_bucket",
            () -> new BucketItem(CompatFluids.QUADROTIC, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> HELIOSIS_BUCKET = ITEMS.register("heliosis_bucket",
            () -> new BucketItem(CompatFluids.HELIOSIS, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> ARKSIANE_BUCKET = ITEMS.register("arksiane_bucket",
            () -> new BucketItem(CompatFluids.ARKSIANE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MINTWOOD_PLANKS = ITEMS.register("mintwood_planks",
            () -> new BlockItem(CompatBlocks.MINTWOOD_PLANKS.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
    public static final RegistryObject<Item> HYREWOOD_PLANKS = ITEMS.register("hyrewood_planks",
            () -> new BlockItem(CompatBlocks.HYREWOOD_PLANKS.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
    public static final RegistryObject<Item> FIREWOOD_PLANKS = ITEMS.register("firewood_planks",
            () -> new BlockItem(CompatBlocks.FIREWOOD_PLANKS.get(), new Item.Properties().tab(DIVINERPG_EXTRAS_MATERIALS)));
    public static final RegistryObject<Item> GREEN_EVERSTONE_BUCKET = ITEMS.register("green_everstone_bucket",
            () -> new BucketItem(CompatFluids.GREEN_EVERSTONE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WHITE_EVERSTONE_BUCKET = ITEMS.register("white_everstone_bucket",
            () -> new BucketItem(CompatFluids.WHITE_EVERSTONE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_EVERSTONE_BUCKET = ITEMS.register("black_everstone_bucket",
            () -> new BucketItem(CompatFluids.BLACK_EVERSTONE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIQUID_EVERSTONE_BUCKET = ITEMS.register("liquid_everstone_bucket",
            () -> new BucketItem(CompatFluids.LIQUID_EVERSTONE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FIRE_CRYSTAL_BUCKET = ITEMS.register("fire_crystal_bucket",
            () -> new BucketItem(CompatFluids.MOLTEN_FIRE_CRYSTAL, new Item.Properties().stacksTo(1)));
}
