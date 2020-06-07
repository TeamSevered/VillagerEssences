package com.teamsevered.villageressences.world.provider;

import com.google.common.collect.ImmutableSet;

import com.teamsevered.villageressences.handlers.registry.BiomeRegistry;
import com.teamsevered.villageressences.world.settings.SandyEssencesGenSettings;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraft.world.storage.WorldInfo;

import java.util.Set;

public class SandyEssencesProvider extends BiomeProvider
{
    private final Layer genBiomes;
    private static final Set<Biome> biomes = ImmutableSet.of(BiomeRegistry.SANDY_ESSENCES.get(), Biomes.DEEP_WARM_OCEAN);

    public SandyEssencesProvider(WorldInfo info, WorldType type)
    {
        super(biomes);
        this.genBiomes = LayerUtil.func_227474_a_(info.getSeed(), type, new SandyEssencesGenSettings());
    }

    public Biome getNoiseBiome(int x, int y, int z)
    {
        return this.genBiomes.func_215738_a(x, z);
    }
}
