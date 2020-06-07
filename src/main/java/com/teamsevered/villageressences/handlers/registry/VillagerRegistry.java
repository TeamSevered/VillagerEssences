package com.teamsevered.villageressences.handlers.registry;

import com.google.common.collect.ImmutableSet;

import com.teamsevered.villageressences.blocks.Blocks;
import com.teamsevered.villageressences.professions.ProfessionBase;
import com.teamsevered.villageressences.util.Reference;
import com.teamsevered.villageressences.util.ReflectionUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Set;

public class VillagerRegistry
{
    public static Set<BlockState> getAllStates(Block block)
    {
        return ImmutableSet.copyOf(block.getStateContainer().getValidStates());
    }


    @SubscribeEvent
    public static void initProfessions(RegistryEvent.Register<VillagerProfession> event)
    {
        for (VillagerProfession profession : ProfessionBase.PROFESSIONS)
        {
            event.getRegistry().register(profession);
        }
    }

    @SubscribeEvent
    public static void initPOI(RegistryEvent.Register<PointOfInterestType> event)
    {
        IForgeRegistry<PointOfInterestType> registry = event.getRegistry();
        registry.register(ReflectionUtil.pointOfInterestType("coal_worker", getAllStates(Blocks.COAL_FORGE), 1, 1).setRegistryName(Reference.MOD_ID, "coal_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("diamond_worker", getAllStates(Blocks.DIAMOND_FORGE), 1, 1).setRegistryName("diamond_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("emerald_worker", getAllStates(Blocks.EMERALD_FORGE), 1, 1).setRegistryName("emerald_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("gold_worker", getAllStates(Blocks.GOLD_FORGE), 1, 1).setRegistryName("emerald_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("iron_worker", getAllStates(Blocks.IRON_FORGE), 1, 1).setRegistryName("emerald_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("lapis_worker", getAllStates(Blocks.LAPIS_FORGE), 1, 1).setRegistryName("emerald_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("quartz_worker", getAllStates(Blocks.QUARTZ_FORGE), 1, 1).setRegistryName("emerald_worker"));
        registry.register(ReflectionUtil.pointOfInterestType("redstone_worker", getAllStates(Blocks.REDSTONE_FORGE), 1, 1).setRegistryName("emerald_worker"));
    }
}
