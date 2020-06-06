package com.teamsevered.villageressences.professions.trades;

import net.minecraft.entity.merchant.villager.VillagerTrades;

public interface ICustomTrade extends VillagerTrades.ITrade
{
    void setCurrency(String currency);
    void setPrice(int price);
}
