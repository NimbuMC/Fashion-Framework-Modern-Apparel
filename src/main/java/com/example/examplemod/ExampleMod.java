package com.example.examplemod;

import com.example.examplemod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.nimbu.fashionframework.FashionFramework;
import net.nimbu.fashionframework.block.ModBlocks;
import net.nimbu.fashionframework.item.ModCreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {

    //Make sure to name your addon here, as well as refactor file names
    public static final String MOD_ID = "examplemod";

    private static final ResourceKey<CreativeModeTab> FASHION_TAB =
            ResourceKey.create(
                    Registries.CREATIVE_MODE_TAB,
                    ResourceLocation.fromNamespaceAndPath(
                            FashionFramework.MOD_ID,
                            "fashion_framework_tab"
                    )
            );

    public ExampleMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // Add all items here
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        //Register each schematic followed by all clothing in such schematic here
        if (event.getTabKey().equals(FASHION_TAB)) {
            event.accept(ModItems.DANTDM_STYLE_SCHEMATIC.get());
            event.accept(ModItems.DANTDM_GOGGLES.get());
            event.accept(ModItems.DANTDM_JACKET.get());
            event.accept(ModItems.DANTDM_PANTS.get());
            event.accept(ModItems.DANTDM_SHOES.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
