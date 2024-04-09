package com.bladecoldsteel.divinerpgextras.init;

import com.bladecoldsteel.divinerpgextras.DivineRPG_Extras;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CompatFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, DivineRPG_Extras.MOD_ID);

    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(DivineRPG_Extras.MOD_ID,
            "blocks/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(DivineRPG_Extras.MOD_ID,
            "blocks/fluids/molten_metal_flowing");

    //Overworld
    public static final RegistryObject<ForgeFlowingFluid.Source> AQUATIC = FLUIDS.register("molten_aquatic",
            () -> new ForgeFlowingFluid.Source(makeMoltenAquaticProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AQUATIC = FLUIDS.register("flowing_molten_aquatic",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAquaticProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenAquaticProperties() {
        return new ForgeFlowingFluid.Properties(AQUATIC, flowing_AQUATIC,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF1965E0)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.AQUATIC_BUCKET).block(CompatBlocks.MOLTEN_AQUATIC).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> ARLEMITE = FLUIDS.register("molten_arlemite",
            () -> new ForgeFlowingFluid.Source(makeMoltenArlemiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ARLEMITE = FLUIDS.register("flowing_molten_arlemite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenArlemiteProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenArlemiteProperties() {
        return new ForgeFlowingFluid.Properties(ARLEMITE, flowing_ARLEMITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF2BBF26)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.ARLEMITE_BUCKET).block(CompatBlocks.MOLTEN_ARLEMITE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> RUPEE = FLUIDS.register("molten_rupee",
            () -> new ForgeFlowingFluid.Source(makeMoltenRupeeProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_RUPEE = FLUIDS.register("flowing_molten_rupee",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenRupeeProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenRupeeProperties() {
        return new ForgeFlowingFluid.Properties(RUPEE, flowing_RUPEE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF1177D1)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.RUPEE_BUCKET).block(CompatBlocks.MOLTEN_RUPEE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> REALMITE = FLUIDS.register("molten_realmite",
            () -> new ForgeFlowingFluid.Source(makeMoltenRealmiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_REALMITE = FLUIDS.register("flowing_molten_realmite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenRealmiteProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenRealmiteProperties() {
        return new ForgeFlowingFluid.Properties(REALMITE, flowing_REALMITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFC9871C)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.REALMITE_BUCKET).block(CompatBlocks.MOLTEN_REALMITE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> SHADOW = FLUIDS.register("molten_shadow_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenShadowProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SHADOW = FLUIDS.register("flowing_molten_shadow_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenShadowProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenShadowProperties() {
        return new ForgeFlowingFluid.Properties(SHADOW, flowing_SHADOW,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF242322)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.SHADOW_BUCKET).block(CompatBlocks.MOLTEN_SHADOW).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> JUNGLE = FLUIDS.register("molten_jungle_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenJungleProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_JUNGLE = FLUIDS.register("flowing_molten_jungle_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenJungleProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenJungleProperties() {
        return new ForgeFlowingFluid.Properties(JUNGLE, flowing_JUNGLE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF57D13F)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.JUNGLE_STONE_BUCKET).block(CompatBlocks.MOLTEN_JUNGLE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> TERRAN = FLUIDS.register("molten_terran_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenTerranProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TERRAN = FLUIDS.register("flowing_molten_terran_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTerranProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenTerranProperties() {
        return new ForgeFlowingFluid.Properties(TERRAN, flowing_TERRAN,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF369E21)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.TERRAN_BUCKET).block(CompatBlocks.MOLTEN_TERRAN).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> CORRUPTED = FLUIDS.register("molten_corrupted_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenCorruptedProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CORRUPTED = FLUIDS.register("flowing_molten_corrupted_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenCorruptedProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenCorruptedProperties() {
        return new ForgeFlowingFluid.Properties(CORRUPTED, flowing_CORRUPTED,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF3f19A8)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.CORRUPTED_BUCKET).block(CompatBlocks.MOLTEN_CORRUPTED).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> DIVINE = FLUIDS.register("molten_divine_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenDivineProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_DIVINE = FLUIDS.register("flowing_molten_divine_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenDivineProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenDivineProperties() {
        return new ForgeFlowingFluid.Properties(DIVINE, flowing_DIVINE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFC9C71A)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.DIVINE_BUCKET).block(CompatBlocks.MOLTEN_DIVINE_STONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> GRAY_DIAMOND = FLUIDS.register("molten_gray_diamond",
            () -> new ForgeFlowingFluid.Source(makeMoltenGrayDiamondProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_GRAY_DIAMOND = FLUIDS.register("flowing_molten_gray_diamond",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenGrayDiamondProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenGrayDiamondProperties() {
        return new ForgeFlowingFluid.Properties(GRAY_DIAMOND, flowing_GRAY_DIAMOND,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF5C5C56)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.GRAY_DIAMOND_BUCKET).block(CompatBlocks.MOLTEN_GRAY_DIAMOND).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> BLUE_DIAMOND = FLUIDS.register("molten_blue_diamond",
            () -> new ForgeFlowingFluid.Source(makeMoltenBlueDiamondProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLUE_DIAMOND = FLUIDS.register("flowing_molten_blue_diamond",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBlueDiamondProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenBlueDiamondProperties() {
        return new ForgeFlowingFluid.Properties(BLUE_DIAMOND, flowing_BLUE_DIAMOND,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF135D8F)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.BLUE_DIAMOND_BUCKET).block(CompatBlocks.MOLTEN_BLUE_DIAMOND).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> RED_DIAMOND = FLUIDS.register("molten_red_diamond",
            () -> new ForgeFlowingFluid.Source(makeMoltenRedDiamondProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_RED_DIAMOND = FLUIDS.register("flowing_molten_red_diamond",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenRedDiamondProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenRedDiamondProperties() {
        return new ForgeFlowingFluid.Properties(RED_DIAMOND, flowing_RED_DIAMOND,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFDB0F0F)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.RED_DIAMOND_BUCKET).block(CompatBlocks.MOLTEN_RED_DIAMOND).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> GREEN_DIAMOND = FLUIDS.register("molten_green_diamond",
            () -> new ForgeFlowingFluid.Source(makeMoltenGreenDiamondProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_GREEN_DIAMOND = FLUIDS.register("flowing_molten_green_diamond",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenGreenDiamondProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenGreenDiamondProperties() {
        return new ForgeFlowingFluid.Properties(GREEN_DIAMOND, flowing_GREEN_DIAMOND,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF4EFF45)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.GREEN_DIAMOND_BUCKET).block(CompatBlocks.MOLTEN_GREEN_DIAMOND).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> YELLOW_DIAMOND = FLUIDS.register("molten_yellow_diamond",
            () -> new ForgeFlowingFluid.Source(makeMoltenYellowDiamondProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_YELLOW_DIAMOND = FLUIDS.register("flowing_molten_yellow_diamond",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenYellowDiamondProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenYellowDiamondProperties() {
        return new ForgeFlowingFluid.Properties(YELLOW_DIAMOND, flowing_YELLOW_DIAMOND,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFF5F12F)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.YELLOW_DIAMOND_BUCKET).block(CompatBlocks.MOLTEN_YELLOW_DIAMOND).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> BLOODGEM = FLUIDS.register("molten_bloodgem",
            () -> new ForgeFlowingFluid.Source(makeMoltenBloodgemProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLOODGEM = FLUIDS.register("flowing_molten_bloodgem",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBloodgemProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenBloodgemProperties() {
        return new ForgeFlowingFluid.Properties(BLOODGEM, flowing_BLOODGEM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFD60F65)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.BLOODGEM_BUCKET).block(CompatBlocks.MOLTEN_BLOODGEM).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> BLUEFIRE = FLUIDS.register("molten_bluefire_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenBluefireProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLUEFIRE = FLUIDS.register("flowing_molten_bluefire_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBluefireProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenBluefireProperties() {
        return new ForgeFlowingFluid.Properties(BLUEFIRE, flowing_BLUEFIRE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF2F1CD9)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.BLUEFIRE_BUCKET).block(CompatBlocks.MOLTEN_BLUEFIRE_STONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_STONE = FLUIDS.register("molten_molten_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenMoltenStoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MOLTEN_STONE = FLUIDS.register("flowing_molten_molten_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenMoltenStoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenMoltenStoneProperties() {
        return new ForgeFlowingFluid.Properties(MOLTEN_STONE, flowing_MOLTEN_STONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFE8371C)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.MOLTEN_STONE_BUCKET).block(CompatBlocks.MOLTEN_MOLTEN_STONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> TORRIDITE = FLUIDS.register("molten_torridite",
            () -> new ForgeFlowingFluid.Source(makeMoltenTorriditeProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TORRIDITE = FLUIDS.register("flowing_molten_torridite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTorriditeProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenTorriditeProperties() {
        return new ForgeFlowingFluid.Properties(TORRIDITE, flowing_TORRIDITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFC91010)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.TORRIDITE_BUCKET).block(CompatBlocks.MOLTEN_TORRIDITE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> HELLSTONE = FLUIDS.register("molten_hellstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenHellstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_HELLSTONE = FLUIDS.register("flowing_molten_hellstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenHellstoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenHellstoneProperties() {
        return new ForgeFlowingFluid.Properties(HELLSTONE, flowing_HELLSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF591E0A)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.HELLSTONE_BUCKET).block(CompatBlocks.MOLTEN_HELLSTONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> ENDER = FLUIDS.register("molten_ender_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenEnderProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ENDER = FLUIDS.register("flowing_molten_ender_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenEnderProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenEnderProperties() {
        return new ForgeFlowingFluid.Properties(ENDER, flowing_ENDER,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFA505AB)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.ENDER_BUCKET).block(CompatBlocks.MOLTEN_ENDER_STONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> BEDROCK_CHUNK = FLUIDS.register("molten_bedrock_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenBedrockChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BEDROCK_CHUNK = FLUIDS.register("flowing_molten_bedrock_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBedrockChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenBedrockChunkProperties() {
        return new ForgeFlowingFluid.Properties(BEDROCK_CHUNK, flowing_BEDROCK_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF19171A)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.BEDROCK_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_BEDROCK_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> EDEN_CHUNK = FLUIDS.register("molten_eden_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenEdenChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_EDEN_CHUNK = FLUIDS.register("flowing_molten_eden_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenEdenChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenEdenChunkProperties() {
        return new ForgeFlowingFluid.Properties(EDEN_CHUNK, flowing_EDEN_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFD13C17)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.EDEN_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_EDEN_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> WILDWOOD_CHUNK = FLUIDS.register("molten_wildwood_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenWildwoodChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_WILDWOOD_CHUNK = FLUIDS.register("flowing_molten_wildwood_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenWildwoodChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenWildwoodChunkProperties() {
        return new ForgeFlowingFluid.Properties(WILDWOOD_CHUNK, flowing_WILDWOOD_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF1768D1)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.WILDWOOD_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_WILDWOOD_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> APALACHIA_CHUNK = FLUIDS.register("molten_apalachia_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenApalachiaChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_APALACHIA_CHUNK = FLUIDS.register("flowing_molten_apalachia_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenApalachiaChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenApalachiaChunkProperties() {
        return new ForgeFlowingFluid.Properties(APALACHIA_CHUNK, flowing_APALACHIA_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFA317D1)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.APALACHIA_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_APALACHIA_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> SKYTHERN_CHUNK = FLUIDS.register("molten_skythern_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenSkythernChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SKYTHERN_CHUNK = FLUIDS.register("flowing_molten_skythern_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenSkythernChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenSkythernChunkProperties() {
        return new ForgeFlowingFluid.Properties(SKYTHERN_CHUNK, flowing_SKYTHERN_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFA09DA1)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.SKYTHERN_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_SKYTHERN_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> MORTUM_CHUNK = FLUIDS.register("molten_mortum_chunk",
            () -> new ForgeFlowingFluid.Source(makeMoltenMortumChunkProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MORTUM_CHUNK = FLUIDS.register("flowing_molten_mortum_chunk",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenMortumChunkProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenMortumChunkProperties() {
        return new ForgeFlowingFluid.Properties(MORTUM_CHUNK, flowing_MORTUM_CHUNK,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF1C1C1C)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.MORTUM_CHUNK_BUCKET).block(CompatBlocks.MOLTEN_MORTUM_CHUNK).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> ICE_STONE = FLUIDS.register("molten_ice_stone",
            () -> new ForgeFlowingFluid.Source(makeMoltenIceStoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ICE_STONE = FLUIDS.register("flowing_molten_ice_stone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenIceStoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenIceStoneProperties() {
        return new ForgeFlowingFluid.Properties(ICE_STONE, flowing_ICE_STONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF9BCFCD)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.ICE_STONE_BUCKET).block(CompatBlocks.MOLTEN_ICE_STONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> ARCANIUM = FLUIDS.register("molten_arcanium",
            () -> new ForgeFlowingFluid.Source(makeMoltenArcaniumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ARCANIUM = FLUIDS.register("flowing_molten_arcanium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenArcaniumProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenArcaniumProperties() {
        return new ForgeFlowingFluid.Properties(ARCANIUM, flowing_ARCANIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF35C4BF)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.ARCANIUM_BUCKET).block(CompatBlocks.MOLTEN_ARCANIUM).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> TEAKER = FLUIDS.register("molten_teaker",
            () -> new ForgeFlowingFluid.Source(makeMoltenTeakerProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TEAKER = FLUIDS.register("flowing_molten_teaker",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTeakerProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenTeakerProperties() {
        return new ForgeFlowingFluid.Properties(TEAKER, flowing_TEAKER,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF1A0000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.TEAKER_BUCKET).block(CompatBlocks.MOLTEN_TEAKER).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> AMTHIRMIS = FLUIDS.register("molten_amthirmis",
            () -> new ForgeFlowingFluid.Source(makeMoltenAmthirmisProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AMTHIRMIS = FLUIDS.register("flowing_molten_amthirmis",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAmthirmisProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenAmthirmisProperties() {
        return new ForgeFlowingFluid.Properties(AMTHIRMIS, flowing_AMTHIRMIS,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF260000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.AMTHIRMIS_BUCKET).block(CompatBlocks.MOLTEN_AMTHIRMIS).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> DARVEN = FLUIDS.register("molten_darven",
            () -> new ForgeFlowingFluid.Source(makeMoltenDarvenProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_DARVEN = FLUIDS.register("flowing_molten_darven",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenDarvenProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenDarvenProperties() {
        return new ForgeFlowingFluid.Properties(DARVEN, flowing_DARVEN,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF420000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.DARVEN_BUCKET).block(CompatBlocks.MOLTEN_DARVEN).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> CERMILE = FLUIDS.register("molten_cermile",
            () -> new ForgeFlowingFluid.Source(makeMoltenCermileProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CERMILE = FLUIDS.register("flowing_molten_cermile",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenCermileProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenCermileProperties() {
        return new ForgeFlowingFluid.Properties(CERMILE, flowing_CERMILE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF590000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.CERMILE_BUCKET).block(CompatBlocks.MOLTEN_CERMILE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> KAROS = FLUIDS.register("molten_karos",
            () -> new ForgeFlowingFluid.Source(makeMoltenKarosProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_KAROS = FLUIDS.register("flowing_molten_karos",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenKarosProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenKarosProperties() {
        return new ForgeFlowingFluid.Properties(KAROS, flowing_KAROS,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF700101)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.KAROS_BUCKET).block(CompatBlocks.MOLTEN_KAROS).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> PARDIMAL = FLUIDS.register("molten_pardimal",
            () -> new ForgeFlowingFluid.Source(makeMoltenPardimalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_PARDIMAL = FLUIDS.register("flowing_molten_pardimal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenPardimalProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenPardimalProperties() {
        return new ForgeFlowingFluid.Properties(PARDIMAL, flowing_PARDIMAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF870000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.PARDIMAL_BUCKET).block(CompatBlocks.MOLTEN_PARDIMAL).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> QUADROTIC = FLUIDS.register("molten_quadrotic",
            () -> new ForgeFlowingFluid.Source(makeMoltenQuadroticProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_QUADROTIC = FLUIDS.register("flowing_molten_quadrotic",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenQuadroticProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenQuadroticProperties() {
        return new ForgeFlowingFluid.Properties(QUADROTIC, flowing_QUADROTIC,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFA10000)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.QUADROTIC_BUCKET).block(CompatBlocks.MOLTEN_QUADROTIC).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> HELIOSIS = FLUIDS.register("molten_heliosis",
            () -> new ForgeFlowingFluid.Source(makeMoltenHeliosisProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_HELIOSIS = FLUIDS.register("flowing_molten_heliosis",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenHeliosisProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenHeliosisProperties() {
        return new ForgeFlowingFluid.Properties(HELIOSIS, flowing_HELIOSIS,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFA30D0D)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.HELIOSIS_BUCKET).block(CompatBlocks.MOLTEN_HELIOSIS).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> ARKSIANE = FLUIDS.register("molten_arksiane",
            () -> new ForgeFlowingFluid.Source(makeMoltenArksianeProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ARKSIANE = FLUIDS.register("flowing_molten_arksiane",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenArksianeProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenArksianeProperties() {
        return new ForgeFlowingFluid.Properties(ARKSIANE, flowing_ARKSIANE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFD41111)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.ARKSIANE_BUCKET).block(CompatBlocks.MOLTEN_ARKSIANE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> AWAKENED_HALITE = FLUIDS.register("molten_awakened_halite",
            () -> new ForgeFlowingFluid.Source(makeMoltenAwakenedHaliteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AWAKENED_HALITE = FLUIDS.register("flowing_molten_awakened_halite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAwakenedHaliteProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenAwakenedHaliteProperties() {
        return new ForgeFlowingFluid.Properties(AWAKENED_HALITE, flowing_AWAKENED_HALITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFCAE8E5)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.AWAKENED_HALITE_BUCKET).block(CompatBlocks.MOLTEN_AWAKENED_HALITE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> GREEN_EVERSTONE = FLUIDS.register("molten_green_everstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenGreenEverstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_GREEN_EVERSTONE = FLUIDS.register("flowing_molten_green_everstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenGreenEverstoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenGreenEverstoneProperties() {
        return new ForgeFlowingFluid.Properties(GREEN_EVERSTONE, flowing_GREEN_EVERSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF06520D)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.GREEN_EVERSTONE_BUCKET).block(CompatBlocks.MOLTEN_GREEN_EVERSTONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> WHITE_EVERSTONE = FLUIDS.register("molten_white_everstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenWhiteEverstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_WHITE_EVERSTONE = FLUIDS.register("flowing_molten_white_everstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenWhiteEverstoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenWhiteEverstoneProperties() {
        return new ForgeFlowingFluid.Properties(WHITE_EVERSTONE, flowing_WHITE_EVERSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFF5F5F5)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.WHITE_EVERSTONE_BUCKET).block(CompatBlocks.MOLTEN_WHITE_EVERSTONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> BLACK_EVERSTONE = FLUIDS.register("molten_black_everstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenBlackEverstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLACK_EVERSTONE = FLUIDS.register("flowing_molten_black_everstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBlackEverstoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenBlackEverstoneProperties() {
        return new ForgeFlowingFluid.Properties(BLACK_EVERSTONE, flowing_BLACK_EVERSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFF141414)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.BLACK_EVERSTONE_BUCKET).block(CompatBlocks.MOLTEN_BLACK_EVERSTONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> LIQUID_EVERSTONE = FLUIDS.register("molten_liquid_everstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenLiquidEverstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_LIQUID_EVERSTONE = FLUIDS.register("flowing_molten_liquid_everstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenLiquidEverstoneProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenLiquidEverstoneProperties() {
        return new ForgeFlowingFluid.Properties(LIQUID_EVERSTONE, flowing_LIQUID_EVERSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFC4C233)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.LIQUID_EVERSTONE_BUCKET).block(CompatBlocks.MOLTEN_LIQUID_EVERSTONE).explosionResistance(1000f).tickRate(9);
    }
    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_FIRE_CRYSTAL = FLUIDS.register("molten_fire_crystal",
            () -> new ForgeFlowingFluid.Source(makeMoltenFireCrystalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_FIRE_CRYSTAL = FLUIDS.register("flowing_molten_fire_crystal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenFireCrystalProperties()));
    private static ForgeFlowingFluid.Properties makeMoltenFireCrystalProperties() {
        return new ForgeFlowingFluid.Properties(MOLTEN_FIRE_CRYSTAL, flowing_FIRE_CRYSTAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW)
                        .overlay(MOLTEN_STILL)
                        .color(0xFFC22727)
                        .luminosity(15)
                        .density(3000)
                        .viscosity(6000)
                        .temperature(1000)
                        .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY))
                .bucket(CompatItems.FIRE_CRYSTAL_BUCKET).block(CompatBlocks.MOLTEN_FIRE_CRYSTAL).explosionResistance(1000f).tickRate(9);
    }
}
