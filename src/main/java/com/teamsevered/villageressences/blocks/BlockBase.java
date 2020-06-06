package com.teamsevered.villageressences.blocks;

import com.teamsevered.villageressences.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockBase extends BlockItem
{
    public BlockBase(Block block)
    {

        super(block, new Item.Properties().group(Reference.CREATIVE_TAB));
    }
}
