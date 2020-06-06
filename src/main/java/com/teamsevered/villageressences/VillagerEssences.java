package com.teamsevered.villageressences;

import com.teamsevered.villageressences.handlers.POIHandler;
import com.teamsevered.villageressences.handlers.registry.BlockRegistry;
import com.teamsevered.villageressences.handlers.registry.ItemsRegistry;
import com.teamsevered.villageressences.util.ReflectionUtil;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("villageressences")
public class VillagerEssences
{
    private static final Logger LOGGER = LogManager.getLogger();

    public VillagerEssences() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BlockRegistry.registerBlocks();
        ItemsRegistry.registerItems();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.COAL_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.DIAMOND_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.EMERALD_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.GOLD_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.LAPIS_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.QUARTZ_FORGE);
        ReflectionUtil.fixPOITypeBlockStates(POIHandler.REDSTONE_FORGE);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {

    }
}
