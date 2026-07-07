package net.nimbu.modernapparel.datagen;

import net.nimbu.modernapparel.ModernApparel;
import net.nimbu.modernapparel.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nimbu.fashionframework.tags.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ModernApparel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.LOW_SUNGLASSES.get())
                .add(ModItems.SUNGLASSES.get())
        ;

        this.tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.HOODIE.get())
                .add(ModItems.ZIP_UP_HOODIE.get())
                .add(ModItems.BOMBER_JACKET.get())
                .add(ModItems.ZIPPED_BOMBER_JACKET.get())
                .add(ModItems.PLAIN_SHIRT.get())
                .add(ModItems.SHIRT_AND_TIE.get())
                .add(ModItems.FLANNEL_SHIRT.get())
        ;

        this.tag(ItemTags.LEG_ARMOR)
                .add(ModItems.SWEATPANTS.get())
                .add(ModItems.PLAIN_PANTS.get())
        ;

        this.tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.SNEAKERS.get())
        ;

        //Only put clothes that use a nonempty second layer in here
        this.tag(ItemTags.DYEABLE)
                .add(ModItems.HOODIE.get())
                .add(ModItems.ZIP_UP_HOODIE.get())
                .add(ModItems.BOMBER_JACKET.get())
                .add(ModItems.ZIPPED_BOMBER_JACKET.get())
                .add(ModItems.PLAIN_SHIRT.get())
                .add(ModItems.SHIRT_AND_TIE.get())
                .add(ModItems.FLANNEL_SHIRT.get())
                .add(ModItems.SWEATPANTS.get())
                .add(ModItems.PLAIN_PANTS.get())
                .add(ModItems.SNEAKERS.get());

        //Put all clothes in this tag
        this.tag(ModTags.Items.CLOTHING)
                .add(ModItems.LOW_SUNGLASSES.get())
                .add(ModItems.SUNGLASSES.get())
                .add(ModItems.HOODIE.get())
                .add(ModItems.ZIP_UP_HOODIE.get())
                .add(ModItems.BOMBER_JACKET.get())
                .add(ModItems.ZIPPED_BOMBER_JACKET.get())
                .add(ModItems.PLAIN_SHIRT.get())
                .add(ModItems.SHIRT_AND_TIE.get())
                .add(ModItems.FLANNEL_SHIRT.get())
                .add(ModItems.SWEATPANTS.get())
                .add(ModItems.PLAIN_PANTS.get())
                .add(ModItems.SNEAKERS.get());


    }
}
