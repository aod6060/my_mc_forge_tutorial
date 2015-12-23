package com.my.tutorial.items;

import com.my.tutorial.creativetabs.TutorialCreativeTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TutorialItems {
	
	// Simple Tutorial Items
	public static Item itemTutorial;
	
	public static void create() {
		itemTutorial = new Item().setUnlocalizedName("item_tutorial");
		
		GameRegistry.registerItem(itemTutorial, "item_tutorial");
		
		
	}
	
	public static void setCreativeTabs() {
		itemTutorial.setCreativeTab(TutorialCreativeTabs.tabMyTutorial);
	}
}
