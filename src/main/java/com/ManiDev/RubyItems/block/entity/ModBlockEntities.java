package com.ManiDev.RubyItems.block.entity;

import com.ManiDev.RubyItems.RubyItems;
import com.ManiDev.RubyItems.block.ModBlocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
                        .create(ForgeRegistries.BLOCK_ENTITY_TYPES, RubyItems.MODID);

        public static final RegistryObject<BlockEntityType<RubyEnrichmentStationBlockEntity>> RUBY_ENRICHMENT_STATION = BLOCK_ENTITIES
                        .register("ruby_enrichment_station",
                                        () -> BlockEntityType.Builder
                                                        .of(RubyEnrichmentStationBlockEntity::new,
                                                                        ModBlocks.RUBY_ENRICHMENT_STATION.get())
                                                        .build(null));

        public static void register(IEventBus eventBus) {
                BLOCK_ENTITIES.register(eventBus);
        }
}
