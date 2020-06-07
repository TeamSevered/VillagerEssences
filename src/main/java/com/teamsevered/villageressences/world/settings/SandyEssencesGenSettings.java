package com.teamsevered.villageressences.world.settings;

import net.minecraft.world.gen.OverworldGenSettings;

public class SandyEssencesGenSettings extends OverworldGenSettings
{
    private final int biomeSize = 4;
    private final int riverSize = 4;
    private final int biomeId = -1;
    private final int bedrockFloorHeight = 0;

    public int getBiomeSize()
    {
        return biomeSize;
    }

    public int getRiverSize()
    {
        return riverSize;
    }

    public int getBiomeId()
    {
        return biomeId;
    }

    public int getBedrockFloorHeight()
    {
        return bedrockFloorHeight;
    }
}
