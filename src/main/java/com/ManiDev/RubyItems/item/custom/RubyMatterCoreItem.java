package com.ManiDev.RubyItems.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RubyMatterCoreItem extends Item {
    public RubyMatterCoreItem(Properties properties){
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 4));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 4));
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 4));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 4));
            player.addEffect(new MobEffectInstance(MobEffects.HEAL, 100, 4));
            player.getCooldowns().addCooldown(this, 200);
        }

        return super.use(level, player, hand);
    }
}