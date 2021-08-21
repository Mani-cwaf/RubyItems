package com.mani_cwaf.ruby_items.items;

import com.mani_cwaf.ruby_items.Ruby_Items;
import net.minecraft.item.Item;
import net.minecraft.item.Food.Builder;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RubyApple extends Item {
    public RubyApple() {
        super((new Properties()).group(Ruby_Items.TAB_RUBY).food((new Builder()).hunger(10).saturation(4.0F).effect(() -> {
            return new EffectInstance(Effects.STRENGTH, 2000, 2);
        }, 1.0F).effect(() -> {
            return new EffectInstance(Effects.ABSORPTION, 4000, 2);
        }, 1.0F).effect(() -> {
            return new EffectInstance(Effects.RESISTANCE, 3000, 2);
        }, 1.0F).effect(() -> {
            return new EffectInstance(Effects.REGENERATION, 120, 10);
        }, 1.0F).effect(() -> {
            return new EffectInstance(Effects.DOLPHINS_GRACE, 3000, 2);
        }, 1.0F).meat().fastToEat().setAlwaysEdible().build()));
    }
}

