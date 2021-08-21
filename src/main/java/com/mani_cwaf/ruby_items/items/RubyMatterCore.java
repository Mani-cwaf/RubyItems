package com.mani_cwaf.ruby_items.items;

import com.mani_cwaf.ruby_items.Ruby_Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.LootTableLoadEvent;

public class RubyMatterCore extends Item {
    public RubyMatterCore() {
        super((new Properties().group(Ruby_Items.TAB_RUBY)));
    }
}