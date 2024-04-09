package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import divinerpg.blocks.base.BlockModLog;
import divinerpg.items.base.ItemMod;
import divinerpg.items.base.ItemModItemBlock;
import divinerpg.items.base.ItemModRanged;
import divinerpg.registries.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class WoodyModifier extends Modifier {

    public WoodyModifier() {
        super(0x451f02);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity attacker = context.getAttacker();
        LivingEntity target = context.getLivingTarget();
        if(attacker.isHolding(tool.getItem())) {
            dropItem(attacker.level, target.getX(), target.getY(), target.getZ(), level * 0.01f);
        }
        return 0;
    }

    @Override
    public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
        LivingEntity player = context.getPlayer();
        if(player.isHolding(tool.getItem())) {
            dropItem(player.level, player.getX(), player.getY(), player.getZ(), level * 0.25f);
        }
    }

    protected void dropItem(World world, double x, double y, double z, float chance) {
        ItemEntity item;
        if(world.isClientSide && RANDOM.nextFloat() < chance) {
            int rand = RANDOM.nextInt(8);
            switch (rand) {
            case 0:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.OAK_LOG));
                world.addFreshEntity(item);
                break;
            case 1:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.BIRCH_LOG));
                world.addFreshEntity(item);
                break;
            case 2:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.SPRUCE_LOG));
                world.addFreshEntity(item);
                break;
            case 3:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.JUNGLE_LOG));
                world.addFreshEntity(item);
                break;
            case 4:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.ACACIA_LOG));
                world.addFreshEntity(item);
                break;
            case 5:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.DARK_OAK_LOG));
                world.addFreshEntity(item);
                break;
            case 6:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.CRIMSON_HYPHAE));
                world.addFreshEntity(item);
                break;
            case 7:
                item = new ItemEntity(world, x, y, z, new ItemStack(Items.WARPED_HYPHAE));
                world.addFreshEntity(item);
                break;
            }
        }
    }
}
