package com.my.tutorial.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class TutorialCreativeTabs {
	public static CreativeTabs tabMyTutorial;
	
	public static void create() {
		tabMyTutorial = new CreativeTabs("tab_my_tutorial") {

			@Override
			public Item getTabIconItem() {
				// TODO Auto-generated method stub
				return Items.apple;
			}
			
		};
	}
}
