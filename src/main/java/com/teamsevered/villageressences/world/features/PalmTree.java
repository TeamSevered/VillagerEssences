package com.teamsevered.villageressences.world.features;

import com.teamsevered.villageressences.blocks.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class PalmTree extends Tree
{
    public static final TreeFeatureConfig PALM_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(Blocks.PALM_WOOD.getDefaultState()),
            new SimpleBlockStateProvider(Blocks.PALM_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(3, 0))).baseHeight(14).heightRandA(5).foliageHeight(9).ignoreVines()
            .setSapling((IPlantable) Blocks.PALM_SAPLING).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bool)
    {
        return Feature.NORMAL_TREE.withConfiguration(PALM_TREE_CONFIG);
    }
}
