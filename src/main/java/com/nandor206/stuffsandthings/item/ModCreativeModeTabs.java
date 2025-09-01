package com.nandor206.stuffsandthings.item;

import com.nandor206.stuffsandthings.StuffsAndThings;
import com.nandor206.stuffsandthings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StuffsAndThings.MOD_ID);

    public static final Supplier<CreativeModeTab> STUFFSANDTHINGS_TAB = CREATIVE_MODE_TAB.register("stuffsandthings_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ROSEGOLD_INGOT.get()))
                    .title(Component.translatable("creativetab.stuffsandthings.stuffsandthings_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.POOP.get());
                        output.accept(ModItems.ROSEGOLD_INGOT.get());

                        output.accept(ModBlocks.POOP_BLOCK.get());
                        output.accept(ModBlocks.ROSEGOLD_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
