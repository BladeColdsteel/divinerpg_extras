package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class CorruptingModifier extends Modifier {

    public CorruptingModifier() {
        super(0x5f10a3);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        PlayerEntity player = context.getPlayerAttacker();
        PlayerEntity health = context.getPlayerAttacker();
        if(player.isAlive()) {
            player.setHealth(20 / (level + 1));
            player.addEffect(new EffectInstance(Effects.HUNGER, 8, level));
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, level * 8, level/2));
            player.addEffect(new EffectInstance(Effects.DIG_SPEED, level * 8, level/2));
        }
        return 0;
    }
}
