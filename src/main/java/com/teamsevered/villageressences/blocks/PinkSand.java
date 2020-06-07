package com.teamsevered.villageressences.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PinkSand extends Block
{
    public PinkSand()
    {
        super(Block.Properties.create(Material.SAND)
                .hardnessAndResistance(10.0F, 100.0F)
                .sound(SoundType.GROUND)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL));
    }
}
