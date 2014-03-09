package com.alexkvazos.staffchatplus;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getCommand("sc").setExecutor(new commandExecutor());
	}
	@Override
	public void onDisable(){
		
	}
	
}
