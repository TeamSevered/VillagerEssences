package com.teamsevered.villageressences.items;

import com.teamsevered.villageressences.util.Reference;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase()
    {
        super(new Item.Properties().group(Reference.CREATIVE_TAB));
    }
}
