package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nimbu.fashionframework.item.ModArmorMaterials;
import net.nimbu.fashionframework.item.custom.ClothingItem;
import net.nimbu.fashionframework.item.custom.StyleSchematicItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MOD_ID);

    //Example Clothing (Credits to... DanTDM I guess lol):
    public static final DeferredItem<Item> DANTDM_GOGGLES = ITEMS.register("dantdm_goggles",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(10)),
                    0xFFFFFFF));

    public static final DeferredItem<Item> DANTDM_JACKET = ITEMS.register("dantdm_jacket",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(10)),
                    0xFFFFFFF));

    public static final DeferredItem<Item> DANTDM_PANTS = ITEMS.register("dantdm_pants",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(10)),
                    0xFFFFFFF));

    public static final DeferredItem<Item> DANTDM_SHOES = ITEMS.register("dantdm_shoes",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.BOOTS.getDurability(10)),
                    0xFFFFFFF));

    //Style Schematic:
    public static final DeferredItem<Item> DANTDM_STYLE_SCHEMATIC = ITEMS.register("dantdm_style_schematic",
            () -> new StyleSchematicItem(new Item.Properties(),
                    List.of(ModItems.DANTDM_GOGGLES.get(),
                            ModItems.DANTDM_JACKET.get(),
                            ModItems.DANTDM_PANTS.get(),
                            ModItems.DANTDM_SHOES.get()
                    )));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
