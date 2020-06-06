package com.teamsevered.villageressences.util;

import com.teamsevered.villageressences.handlers.registry.BlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference
{
    public static final String MOD_ID = "villageressences";
    public static final String MOD_NAME = "Villager Essences";
    public static final String VERSION = "1.15.2-1.0.0";
    public static final String ACCEPTED_VERSIONS = "[1.15.1, 1.15.2]";

    public static final ItemGroup CREATIVE_TAB = new ItemGroup("villagerEssencesTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(BlockRegistry.COAL_FORGE.get());
        }
    };
}
