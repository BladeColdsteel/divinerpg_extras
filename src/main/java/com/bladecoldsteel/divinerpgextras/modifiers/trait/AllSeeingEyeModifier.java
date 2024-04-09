package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class AllSeeingEyeModifier extends Modifier {
    public AllSeeingEyeModifier() {
        super(0xfaf087);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        float chance = level * 0.1f;
        if (RANDOM.nextFloat() < chance) {
            target.addEffect(new EffectInstance(Effects.GLOWING, level / level));
        }
        return 0;
    }
}
