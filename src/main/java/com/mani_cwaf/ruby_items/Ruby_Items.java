package com.mani_cwaf.ruby_items;

import com.mani_cwaf.ruby_items.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("ruby_items")
public class Ruby_Items {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ruby_items";
    public static final ItemGroup TAB_RUBY = new ItemGroup("TabRuby") {
        public ItemStack createIcon() {
            return new ItemStack((IItemProvider)RegistryHandler.RUBY.get());
        }
    };

    public Ruby_Items() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event) {
    }

    private void doClientStuff(FMLClientSetupEvent event) {
    }
}
