package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EdenGardenModifier extends Modifier {

    public EdenGardenModifier() {
        super(0xd6d61c);
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
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.PEONY));
                    world.addFreshEntity(item);
                    break;
                case 1:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.POPPY));
                    world.addFreshEntity(item);
                    break;
                case 2:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.DANDELION));
                    world.addFreshEntity(item);
                    break;
                case 3:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.BLUE_ORCHID));
                    world.addFreshEntity(item);
                    break;
                case 4:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.ALLIUM));
                    world.addFreshEntity(item);
                    break;
                case 5:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.OXEYE_DAISY));
                    world.addFreshEntity(item);
                    break;
                case 6:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.APPLE));
                    world.addFreshEntity(item);
                    break;
                case 7:
                    item = new ItemEntity(world, x, y, z, new ItemStack(Items.GOLDEN_APPLE));
                    world.addFreshEntity(item);
                    break;
            }
        }
    }
}
