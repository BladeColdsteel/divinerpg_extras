package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

import java.util.function.Predicate;

public class DivineInterventionModifier extends Modifier {

    public DivineInterventionModifier() {
        super(0xf2d00c);
    }

    public int afterPlayerDeath(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt, int used) {
        LivingEntity player = context.getPlayerAttacker();
        used = 0;
        if(player.isDeadOrDying() && used <= level &&
                (player.isHolding((Predicate<Item>) getHeldTool(player, Hand.MAIN_HAND))
                        || player.isHolding((Predicate<Item>) getHeldTool(player, Hand.OFF_HAND)))) {
            player.addEffect(new EffectInstance(Effects.HEAL, 2^level));
            used++;
        }
        return 0;
    }
}
