package net.reysmx.lumimod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab Lumi_Tab = new CreativeModeTab("lumitab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AJOLOTE.get());
        }
    };
}
