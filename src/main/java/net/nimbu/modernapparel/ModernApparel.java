package net.nimbu.modernapparel;

import net.nimbu.modernapparel.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.nimbu.fashionframework.FashionFramework;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(ModernApparel.MOD_ID)
public class ModernApparel {

    //Make sure to name your addon here, as well as refactor file names
    public static final String MOD_ID = "modernapparel";

    private static final ResourceKey<CreativeModeTab> FASHION_TAB =
            ResourceKey.create(
                    Registries.CREATIVE_MODE_TAB,
                    ResourceLocation.fromNamespaceAndPath(
                            FashionFramework.MOD_ID,
                            "fashion_framework_tab"
                    )
            );

    public ModernApparel(IEventBus modEventBus, ModContainer modContainer) {
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
            event.accept(ModItems.MODERN_CASUAL_STYLE_SCHEMATIC.get());
            event.accept(ModItems.HOODIE.get());
            event.accept(ModItems.ZIP_UP_HOODIE.get());
            event.accept(ModItems.PLAIN_SHIRT.get());
            event.accept(ModItems.SHIRT_AND_TIE.get());
            event.accept(ModItems.FLANNEL_SHIRT.get());
            event.accept(ModItems.BOMBER_JACKET.get());
            event.accept(ModItems.ZIPPED_BOMBER_JACKET.get());
            event.accept(ModItems.SWEATPANTS.get());
            event.accept(ModItems.PLAIN_PANTS.get());
            event.accept(ModItems.SNEAKERS.get());
            event.accept(ModItems.LOW_SUNGLASSES.get());
            event.accept(ModItems.SUNGLASSES.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
