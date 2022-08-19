package net.reysmx.lumimod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reysmx.lumimod.LumiMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LumiMod.MOD_ID);


    public static final RegistryObject<Item> AJOLOTE = ITEMS.register("ajolote",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.Lumi_Tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
