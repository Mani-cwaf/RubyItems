package com.ManiDev.RubyItems.item;

import com.ManiDev.RubyItems.RubyItems;
import com.ManiDev.RubyItems.item.custom.RubyMatterCoreItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RubyItems.MODID);

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_MATTER_CORE = ITEMS.register("ruby_matter_core",
            () -> new RubyMatterCoreItem(
                    new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB).stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_LEGGING = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 0, 0, new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 0, 0, new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 0, 0, new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 0, 0, new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 0, 0, new Item.Properties().tab(ModCreativeModeTab.RUBY_ITEMS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}