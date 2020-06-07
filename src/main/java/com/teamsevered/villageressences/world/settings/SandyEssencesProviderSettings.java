package com.teamsevered.villageressences.world.settings;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class SandyEssencesProviderSettings extends OverworldBiomeProviderSettings
{
    private final long seed;
    private final WorldType worldType;
    private SandyEssencesGenSettings generatorSettings = new SandyEssencesGenSettings();

    public SandyEssencesProviderSettings(WorldInfo info)
    {
        super(info);
        this.seed = info.getSeed();
        this.worldType = info.getGenerator();
    }

    public SandyEssencesProviderSettings setGeneratorSettings(SandyEssencesGenSettings genSettings)
    {
        this.generatorSettings = genSettings;
        return this;
    }

    public long getSeed()
    {
        return this.seed;
    }

    public WorldType getWorldType()
    {
        return this.worldType;
    }

    public SandyEssencesGenSettings getGeneratorSettings()
    {
        return this.generatorSettings;
    }
}
