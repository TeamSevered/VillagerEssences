package com.teamsevered.villageressences.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class IronForge extends Block
{
    public IronForge()
    {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(100.0F, 1000.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
