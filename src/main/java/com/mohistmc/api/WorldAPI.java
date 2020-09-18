package com.mohistmc.api;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldAPI {
    public static Block getBlock(BlockPos pos, World world){
        return world.getBlockState(pos).getBlock();
    }
    public static void setBlock(BlockPos pos, World world, IBlockState blockState){
        world.setBlockState(pos,blockState);
    }
}
