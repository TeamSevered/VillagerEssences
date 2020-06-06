package com.teamsevered.villageressences.handlers.registry;

import com.teamsevered.villageressences.blocks.BlockBase;
import com.teamsevered.villageressences.items.ItemBase;
import com.teamsevered.villageressences.util.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegistry
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> COAL_ESSENCE = ItemsRegistry.ITEMS.register("coal_essence", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_ESSENCE = ItemsRegistry.ITEMS.register("diamond_essence", ItemBase::new);
    public static final RegistryObject<Item> EMERALD_ESSENCE = ItemsRegistry.ITEMS.register("emerald_essence", ItemBase::new);
    public static final RegistryObject<Item> GOLD_ESSENCE = ItemsRegistry.ITEMS.register("gold_essence", ItemBase::new);
    public static final RegistryObject<Item> IRON_ESSENCE = ItemsRegistry.ITEMS.register("iron_essence", ItemBase::new);
    public static final RegistryObject<Item> LAPIS_ESSENCE = ItemsRegistry.ITEMS.register("lapis_essence", ItemBase::new);
    public static final RegistryObject<Item> QUARTZ_ESSENCE = ItemsRegistry.ITEMS.register("quartz_essence", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_ESSENCE = ItemsRegistry.ITEMS.register("redstone_essence", ItemBase::new);
}
