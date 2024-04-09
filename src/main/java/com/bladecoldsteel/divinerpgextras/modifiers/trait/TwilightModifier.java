package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import divinerpg.util.SpawnEggColors;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.Dimension;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class TwilightModifier extends Modifier {

    public TwilightModifier() {
        super(0xbfb0a4);
    }

    public void addToolStats(ToolDefinition toolDefine, StatsNBT basestats, IModDataReadOnly persistent, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder, ToolAttackContext context, SpawnEggColors.Dimension dimension, RegistryKey<Dimension> vanilla) {
        LivingEntity player = context.getPlayerAttacker();
        if(dimension == SpawnEggColors.Dimension.EDEN) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 2 + (level * 0.02f));
        } else if(dimension == SpawnEggColors.Dimension.APALACHIA) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 2 + (level * 0.04f));
        } else if(dimension == SpawnEggColors.Dimension.WILDWOOD) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 2 + (level * 0.06f));
        } else if(dimension == SpawnEggColors.Dimension.SKYTHERN) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 2 + (level * 0.08f));
        } else if(dimension == SpawnEggColors.Dimension.MORTUM) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 2 + (level * 0.1f));
        } else if(vanilla == Dimension.OVERWORLD) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 0.5);
        } else if(vanilla == Dimension.NETHER) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 0.5);
        } else if(vanilla == Dimension.END) {
            ToolStats.ATTACK_DAMAGE.multiply(builder, 0.5);
        }
    }
}
