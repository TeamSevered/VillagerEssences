package com.teamsevered.villageressences.professions;

import com.google.common.collect.ImmutableSet;
import com.teamsevered.villageressences.handlers.POIHandler;
import com.teamsevered.villageressences.professions.trades.ICustomTrade;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.village.PointOfInterestType;

import javax.annotation.Nullable;

public class CoalWorkerProfession extends ProfessionBase //implements ICustomTrade
{
    public CoalWorkerProfession(String name, PointOfInterestType handler, ImmutableSet<Item> item, ImmutableSet<Block> block, @Nullable SoundEvent event)
    {
        super("coal_worker", POIHandler.COAL_FORGE, ImmutableSet.of(), ImmutableSet.of(), null);
    }

   // @Override
    public void setCurrency(String name)
    {

    }

   // @Override
    public void setPrice(int price)
    {

    }
}
