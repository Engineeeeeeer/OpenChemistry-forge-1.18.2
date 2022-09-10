package com.engineer02.openchemistry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OPENCHEMISTRYTAB = new CreativeModeTab("openchemistrytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REDFLASK.get());
        }
    };
}
