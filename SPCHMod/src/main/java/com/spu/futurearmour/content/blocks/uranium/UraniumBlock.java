package com.spu.futurearmour.content.blocks.uranium;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class UraniumBlock extends Block {
    public UraniumBlock() {
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
