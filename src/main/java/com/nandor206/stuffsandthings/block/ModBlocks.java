package com.nandor206.stuffsandthings.block;

import com.nandor206.stuffsandthings.StuffsAndThings;
import com.nandor206.stuffsandthings.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, StuffsAndThings.MOD_ID);

    public static final RegistryObject<Block> POOP_BLOCK = registerBlock("poop_block",
            () -> new StickyBlock(BlockBehaviour.Properties.of()
                    .instabreak()
                    .mapColor(DyeColor.BROWN)
                    .friction(0.98f)
                    .speedFactor(1.0f)
                    .sound(SoundType.HONEY_BLOCK)
            ));

    public static final RegistryObject<Block> ROSEGOLD_BLOCK = registerBlock("rosegold_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        registerBlockItem(name, block);
        return block;
    }

    private static void registerBlockItem(String name, RegistryObject<Block> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
