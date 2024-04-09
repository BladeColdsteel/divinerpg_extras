package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class PoisonModifier extends Modifier {

    public PoisonModifier() {
        super(0x0d7510);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        float chance = level * 0.3f;
        if(target.isAlive() && (RANDOM.nextFloat() < chance)) {
            target.addEffect(new EffectInstance(Effects.POISON, level * 3, level));
        }
        return 0;
    }
}
