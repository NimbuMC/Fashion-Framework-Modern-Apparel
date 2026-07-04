package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModItems;
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
        super(output, lookupProvider, blockTags, ExampleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.DANTDM_GOGGLES.get());

        this.tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.DANTDM_JACKET.get());

        this.tag(ItemTags.LEG_ARMOR)
                .add(ModItems.DANTDM_PANTS.get());

        this.tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.DANTDM_SHOES.get());

        //Only put clothes that use a second layer in here
//        this.tag(ItemTags.DYEABLE)
//                .add(ModItems.HOODIE.get())
//                .add(ModItems.SWEATPANTS.get())
//                .add(ModItems.SNEAKERS.get())
//                .add(ModItems.CAT_EARS.get());

        //Put all clothes in this tag
        this.tag(ModTags.Items.CLOTHING)
                .add(ModItems.DANTDM_GOGGLES.get())
                .add(ModItems.DANTDM_JACKET.get())
                .add(ModItems.DANTDM_PANTS.get())
                .add(ModItems.DANTDM_SHOES.get());


    }
}
