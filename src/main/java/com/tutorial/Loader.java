package com.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
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
	// SideProxy
	@SidedProxy(clientSide="com.tutorial.ClientProxy", serverSide="com.tutorial.ServerProxy")
	public static CommonProxy proxy;
	
	// PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Hello, from preInit");
		proxy.preInit(e);
	}
	// Init
	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("Hello, from init");
		proxy.init(e);
	}
	// PostInit
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("Hello, from postInit");
		proxy.postInit(e);
	}
}
