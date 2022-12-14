package com.ManiDev.RubyItems.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(4, 3200, 11f,
            2f, 50, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));
}