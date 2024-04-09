package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ArthritisModifier extends Modifier {
    public ArthritisModifier() {
        super(0xfab987);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getAttacker();
        if (attacker.isHolding(tool.getItem())) {
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, level * 5, level * 1));
            target.addEffect(new EffectInstance(Effects.WEAKNESS, level * 4, level * 1));
            target.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, level * 5, level * 1));
        }
        return 0;
    }
}
