package com.teamsevered.villageressences.world.biomes;

import com.teamsevered.villageressences.entities.EntityProtector;
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
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.HeightWithChanceConfig;
import net.minecraft.world.gen.placement.Placement;

public class SandyEssences extends Biome
{
    public SandyEssences(Biome.Builder biomeBuilder)
    {
        super(biomeBuilder);

        //this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(CustonEntities.ENTITYCRAB, 20, 2, 10));
        //this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(CustomEntities.ENTITYPROTECTOR, 20, 2, 10));
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.CHANCE_PASSTHROUGH.configure(new ChanceConfig(128))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.BROWN_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(1, 0.25F))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.RED_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new HeightWithChanceConfig(1, 0.125F))));
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
