package com.bladecoldsteel.divinerpgextras.modifiers;

import com.bladecoldsteel.divinerpgextras.DivineRPG_Extras;
import com.bladecoldsteel.divinerpgextras.modifiers.trait.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class CompatModifiers {
    public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, DivineRPG_Extras.MOD_ID);

    //Traits
    public static final RegistryObject<PoisonModifier> POISON = MODIFIERS.register("poison", PoisonModifier::new);
    public static final RegistryObject<CorruptingModifier> CORRUPTING = MODIFIERS.register("corrupting", CorruptingModifier::new);
    public static final RegistryObject<DivineInterventionModifier> DIVINEINTERVENTION = MODIFIERS.register("divine_intervention", DivineInterventionModifier::new);
    public static final RegistryObject<AllSeeingEyeModifier> ALLSEEINGEYE = MODIFIERS.register("all_seeing_eye", AllSeeingEyeModifier::new);
    public static final RegistryObject<HellfireModifier> HELLFIRE = MODIFIERS.register("hellfire", HellfireModifier::new);
    public static final RegistryObject<InterpolateModifier> INTERPOLATE = MODIFIERS.register("interpolate", InterpolateModifier::new);
    public static final RegistryObject<EarthboundModifier> EARTHBOUND = MODIFIERS.register("earthbound", EarthboundModifier::new);
    public static final RegistryObject<TwilightModifier> TWILIGHT = MODIFIERS.register("twilight", TwilightModifier::new);
    public static final RegistryObject<EdenGardenModifier> EDENGARDEN = MODIFIERS.register("eden_garden", EdenGardenModifier::new);
    public static final RegistryObject<WoodyModifier> WOODY = MODIFIERS.register("woody", WoodyModifier::new);
    public static final RegistryObject<DreamScapeModifier> DREAMSCAPE = MODIFIERS.register("dream_scape", DreamScapeModifier::new);
    public static final RegistryObject<SkyBoundModifier> SKYBOUND = MODIFIERS.register("skybound", SkyBoundModifier::new);
    public static final RegistryObject<IcyModifier> ICY = MODIFIERS.register("icy", IcyModifier::new);
    public static final RegistryObject<MagicalModifier> MAGICAL = MODIFIERS.register("magical", () -> new MagicalModifier());
    public static final RegistryObject<ArthritisModifier> ARTHRITIS = MODIFIERS.register("arthritis", ArthritisModifier::new);
    public static final RegistryObject<MultiHitModifier> MULTIHIT = MODIFIERS.register("multi_hit", MultiHitModifier::new);
    public static final RegistryObject<SkinFryModifier> SKINFRY = MODIFIERS.register("skin_fry", SkinFryModifier::new);
    public static final RegistryObject<HigherLevelModifier> HIGHERLEVEL = MODIFIERS.register("higher_level", HigherLevelModifier::new);
}
