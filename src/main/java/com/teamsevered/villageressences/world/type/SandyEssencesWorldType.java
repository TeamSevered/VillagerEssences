package com.teamsevered.villageressences.world.type;

import com.teamsevered.villageressences.world.provider.SandyEssencesProvider;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.OverworldChunkGenerator;

public class SandyEssencesWorldType extends WorldType
{
    public SandyEssencesWorldType()
    {
        super("sandy_essences_world");
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world)
    {
        return new OverworldChunkGenerator(world, new SandyEssencesProvider(world.getWorldInfo(), this), ChunkGeneratorType.SURFACE.createSettings());
    }
}
