package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class EarthboundModifier extends Modifier {

    public EarthboundModifier() {
        super(0x1f7a04);
    }

    public void addToolStats(ToolDefinition toolDefine, StatsNBT basestats, IModDataReadOnly persistent, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder, ToolAttackContext context) {
        LivingEntity attacker = context.getAttacker();
        if(attacker.horizontalCollision == true) {
            float damage = ToolStats.ATTACK_DAMAGE.getDefaultValue();
            double damageBoost = damage * (level / 3);
            float pSpeed = ToolStats.MINING_SPEED.getDefaultValue();
            double pspeedBoost = pSpeed * (level / 3);
            float aSpeed = ToolStats.ATTACK_SPEED.getDefaultValue();
            double aspeedBoost = aSpeed * (level / 3);
            //Damage Boost
            ToolStats.ATTACK_DAMAGE.add(builder, damageBoost);
            //Attack Speed Boost
            ToolStats.ATTACK_SPEED.add(builder, aspeedBoost);
            //Mining Level Boost
            ToolStats.HARVEST_LEVEL.applyBonus(builder, 1.0);
            //Mining Speed Boost
            ToolStats.MINING_SPEED.multiply(builder, pspeedBoost);
        }
    }
}
