package com.engineer02.openchemistry.item;

import com.engineer02.openchemistry.OpenChemistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OpenChemistry.MOD_ID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB)));
    public static final RegistryObject<Item> REDFLASK = ITEMS.register("redflask", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
