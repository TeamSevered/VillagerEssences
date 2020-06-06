package com.teamsevered.villageressences.professions;

import com.google.common.collect.ImmutableSet;
import com.teamsevered.villageressences.handlers.POIHandler;
import com.teamsevered.villageressences.util.Reference;
import com.teamsevered.villageressences.util.ReflectionUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.village.PointOfInterestType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ProfessionBase
{
    public static final List<VillagerProfession> PROFESSIONS = new ArrayList<>();
    private String name;
    private PointOfInterestType handler;
    private ImmutableSet<Item> item;
    private ImmutableSet<Block> block;
    private SoundEvent event;


    public ProfessionBase(String name, PointOfInterestType handler, ImmutableSet<Item> item, ImmutableSet<Block> block, @Nullable SoundEvent event)
    {
        this.name = name;
        this.handler = handler;
        this.item = item;
        this.block = block;
        this.event = event;

        PROFESSIONS.add(ReflectionUtil.villagerProfession(name, handler, item, block, event).setRegistryName(Reference.MOD_ID, name));
    }
}
