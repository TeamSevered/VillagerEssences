package com.teamsevered.villageressences.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PalmPlanks extends Block
{
    public PalmPlanks()
    {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(10.0F, 100.0F)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
        );
    }
}
