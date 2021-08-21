package com.mani_cwaf.ruby_items.util;

import com.mani_cwaf.ruby_items.Ruby_Items;
import com.mani_cwaf.ruby_items.armor.ModArmorMaterial;
import com.mani_cwaf.ruby_items.blocks.BlockItemBase;
import com.mani_cwaf.ruby_items.blocks.RubyBlock;
import com.mani_cwaf.ruby_items.items.ItemBase;
import com.mani_cwaf.ruby_items.items.RubyApple;
import com.mani_cwaf.ruby_items.items.RubyCrafter;
import com.mani_cwaf.ruby_items.items.RubyMatterCore;
import com.mani_cwaf.ruby_items.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ruby_Items.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ruby_Items.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    public static final RegistryObject<Item> RUBY_MATTER_CORE = ITEMS.register("ruby_matter_core", RubyMatterCore::new);

    public static final RegistryObject<Item> RUBY_CRAFTER = ITEMS.register("ruby_crafter", RubyCrafter::new);

    public static final RegistryObject<RubyApple> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyBlock::new);

    public static final RegistryObject<Block> NETHER_RUBY_ORE = BLOCKS.register("nether_ruby_ore", RubyBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () ->
            new BlockItemBase((Block)RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () ->
            new BlockItemBase((Block)RUBY_ORE.get()));

    public static final RegistryObject<Item> NETHER_RUBY_ORE_ITEM = ITEMS.register("nether_ruby_ore", () ->
            new BlockItemBase((Block)NETHER_RUBY_ORE.get()));

    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 9, -2.0F, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 7, -2.6F, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 5.5F, -2.8F, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 11.0F, -3.0F, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<HoeItem> RUBY_HOE= ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, 1, -0.8F, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Properties().group(Ruby_Items.TAB_RUBY)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Properties().group(Ruby_Items.TAB_RUBY)));
}

