package com.mani_cwaf.ruby_items.world.gen;

import com.mani_cwaf.ruby_items.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(
        modid = "ruby_items",
        bus = Bus.MOD
)
public class ModOreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome  biome : ForgeRegistries.BIOMES)

            //Nether Generation
            if (biome.getCategory() == Category.NETHER) {
                genOre(biome, 3, 5, 0, 100, FillerBlockType.NETHER_ORE_REPLACEABLES, ((Block)RegistryHandler.NETHER_RUBY_ORE.get()).getDefaultState(), 6);
            }
            //End Generation
            else if (biome.getCategory() == Category.THEEND) {

            }
            //Overworld Generation
            else {
                genOre(biome, 1, 2, 0, 16, FillerBlockType.NATURAL_STONE, ((Block)RegistryHandler.RUBY_ORE.get()).getDefaultState(), 5);
            }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}

