package com.mani_cwaf.ruby_items.blocks;

import com.mani_cwaf.ruby_items.Ruby_Items;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item.Properties;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, (new Properties()).group(Ruby_Items.TAB_RUBY));
    }
}

