package com.bladecoldsteel.divinerpgextras.modifiers.trait;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.recipe.SingleItemInventory;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class HellfireModifier extends Modifier {

    private final Cache<Item, Optional<FurnaceRecipe>> recipeCache = CacheBuilder.newBuilder().maximumSize(64L).build();
    private final SingleItemInventory inventory = new SingleItemInventory();

    public HellfireModifier() {
        super(0x2851a);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
        LivingEntity target = context.getLivingTarget();
        LivingEntity player = context.getAttacker();
        if(target.isAlive() && player.isHolding(tool.getItem())) {
            float chance = level * 0.2f;
            if(RANDOM.nextFloat() < chance) {
                target.isSensitiveToWater();
                target.setSecondsOnFire(level * 5);
            }
        }
        return 0;
    }

    private Optional<FurnaceRecipe> findRecipe(ItemStack stack, World world) {
        this.inventory.setStack(stack);
        return world.getRecipeManager().getRecipeFor(IRecipeType.SMELTING, this.inventory, world);
    }

    @Nullable
    private FurnaceRecipe findCachedRecipe(ItemStack stack, World world) {
        if (stack.hasTag()) {
            return (FurnaceRecipe)this.findRecipe(stack, world).orElse((FurnaceRecipe) null);
        } else {
            try {
                return (FurnaceRecipe)((Optional)this.recipeCache.get(stack.getItem(), () -> {
                    return this.findRecipe(stack, world);
                })).orElse((Object)null);
            } catch (ExecutionException var4) {
                return null;
            }
        }
    }

    private ItemStack smeltItem(ItemStack stack, World world, int level) {
        if (TinkerTags.Items.AUTOSMELT_BLACKLIST.contains(stack.getItem())) {
            return stack;
        } else {
            FurnaceRecipe recipe = this.findCachedRecipe(stack, world);
            if (recipe != null) {
                this.inventory.setStack(stack);
                ItemStack output = recipe.assemble(this.inventory);
                if (stack.getCount() > 1) {
                    output.setCount(output.getCount() * stack.getCount() * level);
                }

                return output;
            } else {
                return stack;
            }
        }
    }

    public List<ItemStack> processLoot(IModifierToolStack tool, int level, List<ItemStack> generatedLoot, LootContext context) {
        World world = context.getLevel();
        return !generatedLoot.isEmpty() ? (List)generatedLoot.stream().map((stack) -> {
            return this.smeltItem(stack, world, level);
        }).filter((stack) -> {
            return !stack.isEmpty();
        }).collect(Collectors.toList()) : generatedLoot;
    }
}
