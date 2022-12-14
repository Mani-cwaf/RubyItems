package com.ManiDev.RubyItems.world.feature;

import java.util.List;

import com.ManiDev.RubyItems.RubyItems;
import com.ManiDev.RubyItems.block.ModBlocks;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModConfiguredFeatures {
        public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister
                        .create(Registry.CONFIGURED_FEATURE_REGISTRY, RubyItems.MODID);

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                                        ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RUBY_ORES = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,
                                                        ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> END_RUBY_ORES = Suppliers
                        .memoize(() -> List.of(
                                        OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE),
                                                        ModBlocks.END_RUBY_ORE.get().defaultBlockState())));

        public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 9)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE = CONFIGURED_FEATURES.register(
                        "nether_ruby_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_RUBY_ORES.get(), 11)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> END_RUBY_ORE = CONFIGURED_FEATURES.register(
                        "end_ruby_ore",
                        () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_RUBY_ORES.get(), 12)));

        public static void register(IEventBus eventBus) {
                CONFIGURED_FEATURES.register(eventBus);
        }
}