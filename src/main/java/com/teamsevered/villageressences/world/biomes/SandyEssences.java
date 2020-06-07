package com.teamsevered.villageressences.world.biomes;

import com.teamsevered.villageressences.entities.EntityProtector;
import com.teamsevered.villageressences.world.features.PalmTree;
import net.minecraft.client.renderer.model.MultipartBakedModel;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.TwoFeatureChoiceConfig;
import net.minecraft.world.gen.placement.*;

public class SandyEssences extends Biome
{
    public SandyEssences(Biome.Builder biomeBuilder)
    {
        super(biomeBuilder);

        //this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(CustonEntities.ENTITYCRAB, 20, 2, 10));
        //this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(CustomEntities.ENTITYPROTECTOR, 20, 2, 10));
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.FOSSIL
                .withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                .withPlacement(Placement.CHANCE_PASSTHROUGH
                .configure(new ChanceConfig(128))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE
                .withConfiguration(PalmTree.PALM_TREE_CONFIG)
                .withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7, 0.1f, 1))));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.02F)));
        //this.addStructure(); //todo add world gen for essence villages
        //todo add world gen for sea shells this.addFeature();

        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addExtraGoldOre(this);
        DefaultBiomeFeatures.addDeadBushes(this);
        DefaultBiomeFeatures.addDesertLakes(this);
        DefaultBiomeFeatures.addFossils(this);
        DefaultBiomeFeatures.addExtraEmeraldOre(this);
    }


}
