package com.teamsevered.villageressences.world.biomes;

import com.mojang.datafixers.Dynamic;
import com.teamsevered.villageressences.blocks.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;
import java.util.function.Function;

public class SandyEssencesBuilder extends SurfaceBuilder<SurfaceBuilderConfig>
{
    public SandyEssencesBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> function)
    {
        super(function);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config)
    {
        Random rd = new Random();
        int i = rd.nextInt(3);

        if (i == 0)
        {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, new SurfaceBuilderConfig(Blocks.PINK_SAND.getDefaultState(), net.minecraft.block.Blocks.SANDSTONE.getDefaultState(), net.minecraft.block.Blocks.STONE.getDefaultState()));
        }

        else
        {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, new SurfaceBuilderConfig(i == 1 ? Blocks.PINK_SAND.getDefaultState() : Blocks.PINK_SAND.getDefaultState(), net.minecraft.block.Blocks.SANDSTONE.getDefaultState(), net.minecraft.block.Blocks.STONE.getDefaultState()));
        }
    }
}
