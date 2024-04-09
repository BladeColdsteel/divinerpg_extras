package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.vector.Vector3d;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class IcyModifier extends Modifier {

    public IcyModifier() {
        super(0x9db9f5);
    }

    public void onEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity attacker = context.getAttacker();
        LivingEntity target = context.getLivingTarget();
        if(attacker.isHolding(tool.getItem()) && !target.isAlive()) {
            float chance = level * 0.25f;
            if(RANDOM.nextFloat() < chance) {
                target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, level * 5, level));
                target.clearFire();
                target.handleRelativeFrictionAndCalculateMovement(new Vector3d(1.5, 1.5, 1.5), 1.5f);
            }
        }
    }
}
