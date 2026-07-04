package net.nimbu.modernapparel;

import net.minecraft.client.Minecraft;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.DyedItemColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.nimbu.fashionframework.item.custom.ClothingItem;
import net.nimbu.modernapparel.item.ModItems;

@Mod(value = ModernApparel.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = ModernApparel.MOD_ID, value = Dist.CLIENT)
public class ModernApparelClient {
    public ModernApparelClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Minecraft minecraft = Minecraft.getInstance();

            minecraft.getItemColors().register((stack, tintIndex) -> {
                        if (tintIndex == 0) { if(stack.getItem() instanceof ClothingItem clothingItem) {
                            return 0xFF000000 | //ORs in the alpha value
                                    stack.getOrDefault(DataComponents.DYED_COLOR,
                                            new DyedItemColor(clothingItem.getDefaultColor(), false)
                                    ).rgb();}}
                        return 0xFFFFFFFF;},
                    ModItems.HOODIE.get()
            );
            minecraft.getItemColors().register((stack, tintIndex) -> {
                        if (tintIndex == 0) { if(stack.getItem() instanceof ClothingItem clothingItem) {
                            return 0xFF000000 | //ORs in the alpha value
                                    stack.getOrDefault(DataComponents.DYED_COLOR,
                                            new DyedItemColor(clothingItem.getDefaultColor(), false)
                                    ).rgb();}}
                        return 0xFFFFFFFF;},
                    ModItems.BOMBER_JACKET.get()
            );
            minecraft.getItemColors().register((stack, tintIndex) -> {
                        if (tintIndex == 0) { if(stack.getItem() instanceof ClothingItem clothingItem) {
                            return 0xFF000000 | //ORs in the alpha value
                                    stack.getOrDefault(DataComponents.DYED_COLOR,
                                            new DyedItemColor(clothingItem.getDefaultColor(), false)
                                    ).rgb();}}
                        return 0xFFFFFFFF;},
                    ModItems.SWEATPANTS.get()
            );
            minecraft.getItemColors().register((stack, tintIndex) -> {
                        if (tintIndex == 0) { if(stack.getItem() instanceof ClothingItem clothingItem) {
                            return 0xFF000000 | //ORs in the alpha value
                                    stack.getOrDefault(DataComponents.DYED_COLOR,
                                            new DyedItemColor(clothingItem.getDefaultColor(), false)
                                    ).rgb();}}
                        return 0xFFFFFFFF;},
                    ModItems.PLAIN_PANTS.get()
            );
            minecraft.getItemColors().register((stack, tintIndex) -> {
                        if (tintIndex == 0) { if(stack.getItem() instanceof ClothingItem clothingItem) {
                            return 0xFF000000 | //ORs in the alpha value
                                    stack.getOrDefault(DataComponents.DYED_COLOR,
                                            new DyedItemColor(clothingItem.getDefaultColor(), false)
                                    ).rgb();}}
                        return 0xFFFFFFFF;},
                    ModItems.SNEAKERS.get()
            );

        });
    }
}
