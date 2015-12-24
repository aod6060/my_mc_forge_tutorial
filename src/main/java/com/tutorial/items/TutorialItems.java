package com.tutorial.items;

import com.tutorial.creativetabs.TutorialCreativeTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TutorialItems {
	
	// Simple Tutorial Items
	public static Item itemTutorial;
	
	public static void create() {
		itemTutorial = new Item().setUnlocalizedName("item_tutorial");
	}
	
	public static void register() {
		GameRegistry.registerItem(itemTutorial, "item_tutorial");
	}
	
	public static void setCreativeTabs() {
		itemTutorial.setCreativeTab(TutorialCreativeTabs.tabMyTutorial);
	}
}
