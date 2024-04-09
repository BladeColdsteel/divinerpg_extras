package com.bladecoldsteel.divinerpgextras.init;

import com.bladecoldsteel.divinerpgextras.DivineRPG_Extras;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CompatBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DivineRPG_Extras.MOD_ID);

    public static final RegistryObject<Block> AQUATIC_BLOCK = BLOCKS.register("aquatic_block",
            () -> new Block(AbstractBlock.Properties.of(Material.ICE_SOLID)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f)
                    .sound(SoundType.GLASS)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AQUATIC = BLOCKS.register("molten_aquatic_block",
            () -> new FlowingFluidBlock(CompatFluids.AQUATIC, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ARLEMITE = BLOCKS.register("molten_arlemite_block",
            () -> new FlowingFluidBlock(CompatFluids.ARLEMITE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_RUPEE = BLOCKS.register("molten_rupee_block",
            () -> new FlowingFluidBlock(CompatFluids.RUPEE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_REALMITE = BLOCKS.register("molten_realmite_block",
            () -> new FlowingFluidBlock(CompatFluids.REALMITE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> SHADOW_BLOCK = BLOCKS.register("shadow_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(7.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SHADOW = BLOCKS.register("molten_shadow_block",
            () -> new FlowingFluidBlock(CompatFluids.SHADOW, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> JUNGLE_STONE_BLOCK = BLOCKS.register("jungle_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_JUNGLE = BLOCKS.register("molten_jungle_block",
            () -> new FlowingFluidBlock(CompatFluids.JUNGLE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> TERRAN_STONE_BLOCK = BLOCKS.register("terran_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERRAN = BLOCKS.register("molten_terran_block",
            () -> new FlowingFluidBlock(CompatFluids.TERRAN, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> CORRUPTED_STONE_BLOCK = BLOCKS.register("corrupted_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(7.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CORRUPTED = BLOCKS.register("molten_corrupted_block",
            () -> new FlowingFluidBlock(CompatFluids.CORRUPTED, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> GRAY_DIAMOND_BLOCK = BLOCKS.register("gray_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_GRAY_DIAMOND = BLOCKS.register("molten_gray_diamond_block",
            () -> new FlowingFluidBlock(CompatFluids.GRAY_DIAMOND, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> BLUE_DIAMOND_BLOCK = BLOCKS.register("blue_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLUE_DIAMOND = BLOCKS.register("molten_blue_diamond_block",
            () -> new FlowingFluidBlock(CompatFluids.BLUE_DIAMOND, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = BLOCKS.register("red_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_RED_DIAMOND = BLOCKS.register("molten_red_diamond_block",
            () -> new FlowingFluidBlock(CompatFluids.RED_DIAMOND, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> GREEN_DIAMOND_BLOCK = BLOCKS.register("green_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_GREEN_DIAMOND = BLOCKS.register("molten_green_diamond_block",
            () -> new FlowingFluidBlock(CompatFluids.GREEN_DIAMOND, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = BLOCKS.register("yellow_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_YELLOW_DIAMOND = BLOCKS.register("molten_yellow_diamond_block",
            () -> new FlowingFluidBlock(CompatFluids.YELLOW_DIAMOND, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> DIVINE_STONE_BLOCK = BLOCKS.register("divine_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(7)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(15.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_DIVINE_STONE = BLOCKS.register("molten_divine_stone_block",
            () -> new FlowingFluidBlock(CompatFluids.DIVINE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLOODGEM = BLOCKS.register("molten_bloodgem_block",
            () -> new FlowingFluidBlock(CompatFluids.BLOODGEM, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> HELLSTONE_BLOCK = BLOCKS.register("hellstone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_HELLSTONE = BLOCKS.register("molten_hellstone_block",
            () -> new FlowingFluidBlock(CompatFluids.HELLSTONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> BLUEFIRE_STONE_BLOCK = BLOCKS.register("bluefire_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(15.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLUEFIRE_STONE = BLOCKS.register("molten_bluefire_stone_block",
            () -> new FlowingFluidBlock(CompatFluids.BLUEFIRE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> MOLTEN_STONE_BLOCK = BLOCKS.register("molten_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(10.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MOLTEN_STONE = BLOCKS.register("molten_molten_stone_block",
            () -> new FlowingFluidBlock(CompatFluids.MOLTEN_STONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TORRIDITE = BLOCKS.register("molten_torridite_block",
            () -> new FlowingFluidBlock(CompatFluids.TORRIDITE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> ENDER_STONE_BLOCK = BLOCKS.register("ender_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(12.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDER_STONE = BLOCKS.register("molten_ender_stone_block",
            () -> new FlowingFluidBlock(CompatFluids.ENDER, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> BEDROCK_CHUNK_BLOCK = BLOCKS.register("bedrock_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(20.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BEDROCK_CHUNK = BLOCKS.register("molten_bedrock_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.BEDROCK_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> EDEN_CHUNK_BLOCK = BLOCKS.register("eden_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(6)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(22.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_EDEN_CHUNK = BLOCKS.register("molten_eden_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.EDEN_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> WILDWOOD_CHUNK_BLOCK = BLOCKS.register("wildwood_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(7)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(25.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_WILDWOOD_CHUNK = BLOCKS.register("molten_wildwood_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.WILDWOOD_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> APALACHIA_CHUNK_BLOCK = BLOCKS.register("apalachia_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(8)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(27.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_APALACHIA_CHUNK = BLOCKS.register("molten_apalachia_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.APALACHIA_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> SKYTHERN_CHUNK_BLOCK = BLOCKS.register("skythern_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(9)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(30.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SKYTHERN_CHUNK = BLOCKS.register("molten_skythern_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.SKYTHERN_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> MORTUM_CHUNK_BLOCK = BLOCKS.register("mortum_chunk_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(10)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(32.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MORTUM_CHUNK = BLOCKS.register("molten_mortum_chunk_block",
            () -> new FlowingFluidBlock(CompatFluids.MORTUM_CHUNK, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> ICE_STONE_BLOCK = BLOCKS.register("ice_stone_block",
            () -> new Block(AbstractBlock.Properties.of(Material.ICE_SOLID)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0f)
                    .sound(SoundType.GLASS)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ICE_STONE = BLOCKS.register("molten_ice_stone_block",
            () -> new FlowingFluidBlock(CompatFluids.ICE_STONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ARCANIUM = BLOCKS.register("molten_arcanium_block",
            () -> new FlowingFluidBlock(CompatFluids.ARCANIUM, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TEAKER = BLOCKS.register("molten_teaker_block",
            () -> new FlowingFluidBlock(CompatFluids.TEAKER, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AMTHIRMIS = BLOCKS.register("molten_amthirmis_block",
            () -> new FlowingFluidBlock(CompatFluids.AMTHIRMIS, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_DARVEN = BLOCKS.register("molten_darven_block",
            () -> new FlowingFluidBlock(CompatFluids.DARVEN, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CERMILE = BLOCKS.register("molten_cermile_block",
            () -> new FlowingFluidBlock(CompatFluids.CERMILE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_KAROS = BLOCKS.register("molten_karos_block",
            () -> new FlowingFluidBlock(CompatFluids.KAROS, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_PARDIMAL = BLOCKS.register("molten_pardimal_block",
            () -> new FlowingFluidBlock(CompatFluids.PARDIMAL, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_QUADROTIC = BLOCKS.register("molten_quadrotic_block",
            () -> new FlowingFluidBlock(CompatFluids.QUADROTIC, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_HELIOSIS = BLOCKS.register("molten_heliosis_block",
            () -> new FlowingFluidBlock(CompatFluids.HELIOSIS, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ARKSIANE = BLOCKS.register("molten_arksiane_block",
            () -> new FlowingFluidBlock(CompatFluids.ARKSIANE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<Block> MINTWOOD_PLANKS = BLOCKS.register("mintwood_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .requiresCorrectToolForDrops()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HYREWOOD_PLANKS = BLOCKS.register("hyrewood_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .requiresCorrectToolForDrops()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FIREWOOD_PLANKS = BLOCKS.register("firewood_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .requiresCorrectToolForDrops()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> AWAKENED_HALITE_BLOCK = BLOCKS.register("awakened_halite_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestLevel(11)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(40.0f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AWAKENED_HALITE = BLOCKS.register("molten_awakened_halite_block",
            () -> new FlowingFluidBlock(CompatFluids.AWAKENED_HALITE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_GREEN_EVERSTONE = BLOCKS.register("molten_green_everstone_block",
            () -> new FlowingFluidBlock(CompatFluids.GREEN_EVERSTONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_WHITE_EVERSTONE = BLOCKS.register("molten_white_everstone_block",
            () -> new FlowingFluidBlock(CompatFluids.WHITE_EVERSTONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLACK_EVERSTONE = BLOCKS.register("molten_black_everstone_block",
            () -> new FlowingFluidBlock(CompatFluids.BLACK_EVERSTONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_LIQUID_EVERSTONE = BLOCKS.register("molten_liquid_everstone_block",
            () -> new FlowingFluidBlock(CompatFluids.LIQUID_EVERSTONE, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_FIRE_CRYSTAL = BLOCKS.register("molten_fire_crystal_block",
            () -> new FlowingFluidBlock(CompatFluids.MOLTEN_FIRE_CRYSTAL, Block.Properties.of(Material.LAVA)
                    .lightLevel((state) -> { return 15; })
                    .randomTicks()
                    .strength(100.0f)
                    .noDrops()));
}
