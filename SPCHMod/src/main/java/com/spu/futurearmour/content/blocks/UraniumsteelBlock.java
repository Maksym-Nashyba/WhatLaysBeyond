package com.spu.futurearmour.content.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class UraniumsteelBlock extends Block {
    public UraniumsteelBlock() {
        super(Properties.of(Material.STONE)
        .sound(SoundType.STONE)
        .strength(2));
    }

    @SuppressWarnings("deprecation")
    @Override
    public float getShadeBrightness(BlockState blockState, IBlockReader blockReader, BlockPos blockPos) {
        return 1F;
    }
}
