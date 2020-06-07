package com.teamsevered.villageressences.blocks;

import com.teamsevered.villageressences.world.features.PalmTree;

import net.minecraft.block.Block;

public class Blocks
{
    public static final Block COAL_FORGE = new CoalForge();
    public static final Block DIAMOND_FORGE = new DiamondForge();
    public static final Block EMERALD_FORGE = new EmeraldForge();
    public static final Block GOLD_FORGE = new GoldForge();
    public static final Block IRON_FORGE = new IronForge();
    public static final Block LAPIS_FORGE = new LapisForge();
    public static final Block QUARTZ_FORGE = new QuartzForge();
    public static final Block REDSTONE_FORGE = new QuartzForge();
    public static final Block PINK_SAND = new PinkSand();
    public static final Block PALM_LEAVES = new PalmLeaves();
    public static final Block PALM_WOOD = new PalmWood();
    public static final Block PALM_PLANKS = new PalmPlanks();
    public static final Block PALM_SAPLING = new PalmSapling(new PalmTree(), Block.Properties.from(net.minecraft.block.Blocks.OAK_SAPLING));
}
