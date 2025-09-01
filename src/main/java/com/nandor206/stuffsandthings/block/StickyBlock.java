package com.nandor206.stuffsandthings.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class StickyBlock extends Block {
    public StickyBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public boolean isStickyBlock(BlockState state) {
        return true;
    }
}
