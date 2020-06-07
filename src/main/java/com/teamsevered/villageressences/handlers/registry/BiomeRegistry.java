package com.teamsevered.villageressences.handlers.registry;

import com.teamsevered.villageressences.util.Reference;
import com.teamsevered.villageressences.world.biomes.SandyEssences;
import com.teamsevered.villageressences.world.biomes.SandyEssencesBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class BiomeRegistry
{
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Reference.MOD_ID);

    public static final RegistryObject<Biome> SANDY_ESSENCES =
            BIOMES.register(
                    "sandy_essences", () -> new SandyEssences(
                            new Biome.Builder()
                                    .precipitation(Biome.RainType.NONE)
                                    .scale(10.0F).temperature(5.0F)
                                    .waterColor(16761027)
                                    .waterFogColor(15910336)
                                    .surfaceBuilder(
                                            new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
                                                    register("sandy_surface",
                                                            new SandyEssencesBuilder(
                                                                    SurfaceBuilderConfig::deserialize)),
                                                    new SurfaceBuilderConfig(com.teamsevered.villageressences.blocks.Blocks.PINK_SAND.getDefaultState(),
                                                            Blocks.SANDSTONE.getDefaultState(),
                                                            Blocks.STONE.getDefaultState()))
                                    )
                                    .category(Biome.Category.DESERT).downfall(0.5f).depth(0.12f).parent(null)));

    public static void registerBiomes()
    {
        registerBiome(SANDY_ESSENCES.get(), BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types)
    {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 100));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }

    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn)
    {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }

    @SubscribeEvent
    public static void onBiomeRegister(RegistryEvent.Register<Biome> event)
    {
        registerBiomes();
    }

}
