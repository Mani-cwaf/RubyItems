package com.ManiDev.RubyItems;

import com.ManiDev.RubyItems.block.ModBlocks;
import com.ManiDev.RubyItems.block.entity.ModBlockEntities;
import com.ManiDev.RubyItems.block.screen.ModMenuTypes;
import com.ManiDev.RubyItems.block.screen.RubyEnrichmentStationScreen;
import com.ManiDev.RubyItems.item.ModItems;
import com.ManiDev.RubyItems.world.feature.ModConfiguredFeatures;
import com.ManiDev.RubyItems.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RubyItems.MODID)
public class RubyItems {
    public static final String MODID = "rubyitems";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RubyItems() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.RUBY_INFUSING_STATION_MENU.get(), RubyEnrichmentStationScreen::new);
        }
    }
}
