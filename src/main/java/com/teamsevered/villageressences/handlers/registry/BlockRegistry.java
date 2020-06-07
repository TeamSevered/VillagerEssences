package com.teamsevered.villageressences.handlers.registry;

import com.teamsevered.villageressences.blocks.*;
import com.teamsevered.villageressences.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static void registerBlocks()
    {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> COAL_FORGE = BLOCKS.register("coal_forge", CoalForge::new);
    public static final RegistryObject<Block> DIAMOND_FORGE = BLOCKS.register("diamond_forge", DiamondForge::new);
    public static final RegistryObject<Block> EMERALD_FORGE = BLOCKS.register("emerald_forge", EmeraldForge::new);
    public static final RegistryObject<Block> GOLD_FORGE = BLOCKS.register("gold_forge", GoldForge::new);
    public static final RegistryObject<Block> IRON_FORGE = BLOCKS.register("iron_forge", IronForge::new);
    public static final RegistryObject<Block> LAPIS_FORGE = BLOCKS.register("lapis_forge", LapisForge::new);
    public static final RegistryObject<Block> QUARTZ_FORGE = BLOCKS.register("quartz_forge", QuartzForge::new);
    public static final RegistryObject<Block> REDSTONE_FORGE = BLOCKS.register("redstone_forge", RedstoneForge::new);
    public static final RegistryObject<Item> COAL_FORGE_ITEM = ItemsRegistry.ITEMS.register("coal_forge", () -> new BlockBase(COAL_FORGE.get()));
    public static final RegistryObject<Item> DIAMOND_FORGE_ITEM = ItemsRegistry.ITEMS.register("diamond_forge", () -> new BlockBase(DIAMOND_FORGE.get()));
    public static final RegistryObject<Item> EMERALD_FORGE_ITEM = ItemsRegistry.ITEMS.register("emerald_forge", () -> new BlockBase(EMERALD_FORGE.get()));
    public static final RegistryObject<Item> GOLD_FORGE_ITEM = ItemsRegistry.ITEMS.register("gold_forge", () -> new BlockBase(GOLD_FORGE.get()));
    public static final RegistryObject<Item> IRON_FORGE_ITEM = ItemsRegistry.ITEMS.register("iron_forge", () -> new BlockBase(IRON_FORGE.get()));
    public static final RegistryObject<Item> LAPIS_FORGE_ITEM = ItemsRegistry.ITEMS.register("lapis_forge", () -> new BlockBase(LAPIS_FORGE.get()));
    public static final RegistryObject<Item> QUARTZ_FORGE_ITEM = ItemsRegistry.ITEMS.register("quartz_forge", () -> new BlockBase(QUARTZ_FORGE.get()));
    public static final RegistryObject<Item> REDSTONE_FORGE_ITEM = ItemsRegistry.ITEMS.register("redstone_forge", () -> new BlockBase(REDSTONE_FORGE.get()));
}
