package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class HigherLevelModifier extends Modifier {

    public HigherLevelModifier() {
        super(0x5bbd61);
    }

    public void addToolStats(IModifierToolStack tool, ToolDefinition toolDefine, StatsNBT basestats, IModDataReadOnly persistent, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder, ToolAttackContext context) {
        LivingEntity attacker = context.getAttacker();
        if(attacker.isHolding(tool.getItem())) {
            ToolStats.ATTACK_SPEED.multiply(builder, level);
            ToolStats.ATTACK_DAMAGE.multiply(builder, level);
            ToolStats.HARVEST_LEVEL.applyBonus(builder, level);
            ToolStats.MINING_SPEED.multiply(builder, level);
            ToolStats.DURABILITY.multiply(builder, level);
        }
    }
}
