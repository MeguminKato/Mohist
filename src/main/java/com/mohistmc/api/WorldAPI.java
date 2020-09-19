package com.mohistmc.api;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

import java.util.List;

public class WorldAPI {
    public static Block getBlock(BlockPos pos, World world){
        return world.getBlockState(pos).getBlock();
    }
    public static void setBlock(BlockPos pos, World world, IBlockState blockState){
        world.setBlockState(pos,blockState);
    }
    public static World getWorld(String worldName){
        for (World worldserver : (World[])ServerAPI.getNMSServer().worlds) {
            if(worldserver.getWorldInfo().getWorldName().equals(worldName)){
                return worldserver;
            }

        }
        return null;
    }
    public static List<Entity> getLoadedEntityList(World world){
        return world.getLoadedEntityList();
    }
    public static String getBlockUnlocalizedName(IBlockState blockState){
        return blockState.getBlock().getUnlocalizedName();
    }
    public static int getBlockTypeId(BlockPos blockPos,World world){
        return world.getTileEntity(blockPos).getBlockMetadata();
    }
}
