package com.mani_cwaf.ruby_items.items;

import com.mani_cwaf.ruby_items.Ruby_Items;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super((new Properties().group(Ruby_Items.TAB_RUBY)));
    }
}