package net.nimbu.modernapparel.item;

import net.nimbu.modernapparel.ModernApparel;
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
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModernApparel.MOD_ID);


    public static final DeferredItem<Item> HOODIE = ITEMS.register("hoodie",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(10)),
                    0x9999FF));

    public static final DeferredItem<Item> BOMBER_JACKET = ITEMS.register("bomber_jacket",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(10)),
                    0x5b2f0c));

    public static final DeferredItem<Item> SWEATPANTS = ITEMS.register("sweatpants",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(10)),
                    0x111111));

    public static final DeferredItem<Item> PLAIN_PANTS = ITEMS.register("plain_pants",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(10)),
                    0x111111));

    public static final DeferredItem<Item> SNEAKERS = ITEMS.register("sneakers",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.BOOTS.getDurability(10)),
                    0xFFFFFFF));

    public static final DeferredItem<Item> SUNGLASSES = ITEMS.register("sunglasses",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(10)),
                    0xFFFFFFF));
    public static final DeferredItem<Item> LOW_SUNGLASSES = ITEMS.register("low_sunglasses",
            () -> new ClothingItem(ModArmorMaterials.CLOTH_ARMOUR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(10)),
                    0xFFFFFFF));


    //Schematic:
    public static final DeferredItem<Item> MODERN_CASUAL_STYLE_SCHEMATIC = ITEMS.register("modern_casual_style_schematic",
            () -> new StyleSchematicItem(new Item.Properties(),
                    List.of(ModItems.HOODIE.get(),
                            ModItems.BOMBER_JACKET.get(),
                            ModItems.SWEATPANTS.get(),
                            ModItems.SNEAKERS.get(),
                            ModItems.SUNGLASSES.get(),
                            ModItems.LOW_SUNGLASSES.get()
                    )));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
