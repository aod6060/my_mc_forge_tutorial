package com.my.tutorial;

import com.my.tutorial.creativetabs.TutorialCreativeTabs;
import com.my.tutorial.items.TutorialItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	// PreInit
	public void preInit(FMLPreInitializationEvent e) {
		
		TutorialItems.create();
		
		TutorialCreativeTabs.create();
		
		TutorialItems.setCreativeTabs();
		
		
	}
	// Init
	public void init(FMLInitializationEvent e) {
	}
	// PostInit
	public void postInit(FMLPostInitializationEvent e) {

	}
}
