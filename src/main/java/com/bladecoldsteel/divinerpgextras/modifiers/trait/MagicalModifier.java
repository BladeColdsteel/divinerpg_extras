package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import com.google.common.collect.Multimap;
import divinerpg.capability.Arcana;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class MagicalModifier extends Modifier {

    public MagicalModifier() {
        super(0x6e10e0);
    }

    public int arcanaConsumed;

    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getPlayerAttacker();
        if(attacker.isHolding(tool.getItem())) {
            Arcana arcana = null;
            int arcanaConsumed = level * 15;
            if(arcana.getArcana() >= arcanaConsumed) {
                float attackDmg = tool.getModifier(ToolStats.ATTACK_DAMAGE);
                float damageBoost = attackDmg * (level / 5);
                target.hurt(DamageSource.MAGIC, damageBoost);
            }
        }
        return 0;
    }
}
