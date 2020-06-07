package com.teamsevered.villageressences.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PalmSapling extends Block
{
    public PalmSapling()
    {
        super(Block.Properties.create(Material.PLANTS)
                .hardnessAndResistance(1.0F, 1.0F)
                .sound(SoundType.PLANT)
        );
    }
}
