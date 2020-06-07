package com.teamsevered.villageressences.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PalmLeaves extends Block
{
    public PalmLeaves()
    {
        super(Block.Properties.create(Material.LEAVES)
                .hardnessAndResistance(10.0F, 100.0F)
                .sound(SoundType.PLANT)
                .noDrops()
        );
    }
}
