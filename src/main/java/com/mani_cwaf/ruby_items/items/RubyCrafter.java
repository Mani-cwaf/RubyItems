package com.mani_cwaf.ruby_items.items;

import com.mani_cwaf.ruby_items.Ruby_Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RubyCrafter extends Item {
    public RubyCrafter() {
        super((new Properties().group(Ruby_Items.TAB_RUBY).defaultMaxDamage(64)));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        final ItemStack copy = itemStack.copy();
        if(copy.attemptDamageItem(1, Item.random, null)){
            copy.shrink(1);
            copy.setDamage(0);
        }
        return copy;
    }
}