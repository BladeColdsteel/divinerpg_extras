package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MultiHitModifier extends Modifier {

    public MultiHitModifier() {
        super(0xbdbbbf);
    }

    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getPlayerAttacker();
        if(attacker.isHolding(tool.getItem())) {
            target.hurt(DamageSource.GENERIC, damageDealt);
        }
        return 0;
    }
}
