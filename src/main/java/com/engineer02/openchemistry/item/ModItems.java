package com.engineer02.openchemistry.item;

import com.engineer02.openchemistry.OpenChemistry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenChemistry.MOD_ID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB)));
    public static final RegistryObject<Item> REDFLASK = ITEMS.register("redflask", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB)));
    public static final RegistryObject<Item> HYDROGEN = ITEMS.register("hydrogen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> HELIUM = ITEMS.register("helium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> BERYLLIUM = ITEMS.register("beryllium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> BORON = ITEMS.register("boron", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> NITROGEN = ITEMS.register("nitrogen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> OXYGEN = ITEMS.register("oxygen", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> FLUORINE = ITEMS.register("fluorine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> NEON = ITEMS.register("neon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> SODIUM = ITEMS.register("sodium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("magnesium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> CHLORINE = ITEMS.register("chlorine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));
    public static final RegistryObject<Item> ARGON = ITEMS.register("argon", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OPENCHEMISTRYTAB).durability(16000)));





    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }

}
