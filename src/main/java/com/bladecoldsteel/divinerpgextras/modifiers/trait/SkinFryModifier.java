package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class SkinFryModifier extends Modifier {

    public SkinFryModifier() {
        super(0xe09710);
    }

    private boolean isEntityInSunlight(Entity entity, World world) {
        Vector3d playerPos = entity.position();
        BlockPos blockPos = new BlockPos(playerPos);
        return world.isDay() && world.canSeeSky(blockPos);
    }

    public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context, Attribute attribute, World world) {
        LivingEntity player = context.getPlayer();
        float chance = level * 0.2f;
        if(RANDOM.nextFloat() < chance) {
            if(isEntityInSunlight(player, world)) {
                player.setSecondsOnFire(level * 5);
            }
        }
    }

    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt, World world) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getPlayerAttacker();
        float chance = level * 0.2f;
        if(RANDOM.nextFloat() < chance) {
            if(attacker.isHolding(tool.getItem())) {
                if(isEntityInSunlight(target, world) == true) {
                    target.setSecondsOnFire(level * 5);
                }
            }
        }
        return 0;
    }
}
