package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class InterpolateModifier extends Modifier {

    public InterpolateModifier() {
        super(0x9c2abf);
    }

    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity attacker = context.getAttacker();
        if(attacker.isHolding(tool.getItem())) {
            boolean deadTarget = target.isDeadOrDying();
            if(deadTarget = true) {
                dropItem(attacker.level, attacker.getX(), attacker.getY(), attacker.getZ(), level / 5, target);
            }
        }
        return 0;
    }

    public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context, BlockPos blockPos, Block block, BlockState blockState, TileEntity tileEntity) {
        PlayerEntity player = context.getPlayer();
        if(player.isHolding(tool.getItem())) {
            dropBlockItem(player.level, player.getX(), player.getY(), player.getZ(), level / 5, blockPos, block, blockState, tileEntity);
        }
    }

    protected void dropItem(World world, double x, double y, double z, float chance, LivingEntity target) {
        ItemEntity item;
        if(world.isClientSide && RANDOM.nextFloat() < chance) {
            target.captureDrops();
        }
    }

    protected void dropBlockItem(World world, double x, double y, double z, float chance, BlockPos blockPos, Block block, BlockState blockState, TileEntity tileEntity) {
        ItemEntity item;
        if(world.isClientSide && RANDOM.nextFloat() < chance) {
            block.getDrops(blockState, (ServerWorld) world, blockPos, tileEntity);
        }
    }
}
