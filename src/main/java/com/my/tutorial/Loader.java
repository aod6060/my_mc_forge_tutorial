package com.my.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Loader.ID, name=Loader.NAME, version=Loader.VERSION)
public class Loader {
	// ID
	public static final String ID = "my_tutorial";
	// NAME
	public static final String NAME = "My Tutorial";
	// VERSION
	public static final String VERSION = "mc18:f1563:m1";
	// Instance
	@Instance
	public static Loader INSTANCE = new Loader();
	
	
	// PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Hello, from preInit");
	}
	// Init
	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("Hello, from init");
	}
	// PostInit
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("Hello, from postInit");
	}
}
