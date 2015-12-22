package com.my.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Loader.ID, name=Loader.NAME, version=Loader.VERSION)
public class Loader {
	public final static String ID = "my_tutorial";
	public final static String NAME = "My Tutorial";
	public final static String VERSION = "mc18:f1563:m1";
	
	@Instance
	public static Loader INSTANCE = new Loader();
	
	
	@EventHandler
	// PreInit - This is used to register
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Hello, From preInit");
	}
	
	@EventHandler
	// Init - This recipes 
	public void init(FMLInitializationEvent e) {
		System.out.println("Hello, From init");
	}
	
	@EventHandler
	// PostInit -
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("Hello, From postInit");
	}
}
