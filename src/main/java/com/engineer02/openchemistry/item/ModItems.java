package com.engineer02.openchemistry.item;

import com.engineer02.openchemistry.OpenChemistry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenChemistry.MOD_ID);


    public static final RegistryObject<Item> HYDROGEN = ITEMS.register("hydrogen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));






    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }

}
