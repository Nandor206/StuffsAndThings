package com.nandor206.stuffsandthings.item;

import com.nandor206.stuffsandthings.StuffsAndThings;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, StuffsAndThings.MOD_ID);

    public static final RegistryObject<Item> ROSEGOLD_INGOT = ITEMS.register("rosegold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POOP = ITEMS.register("poop",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
