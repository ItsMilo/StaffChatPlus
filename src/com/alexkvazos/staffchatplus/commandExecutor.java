package com.alexkvazos.staffchatplus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class commandExecutor implements CommandExecutor{

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//Variables
		String prefix = (ChatColor.RED+"["+ChatColor.GOLD+"StaffChatPlus"+ChatColor.RED+"]"+ChatColor.YELLOW+" ");
		String name = sender.getName();
		String message = "";
		
		//Arguments Loop
		ArrayList<String> arguments = new ArrayList<String>(Arrays.asList(args));
		String text = "";
		for(int x = 1; x < arguments.size(); x++){
		text += " " + arguments.get(x);
		text=text.replaceAll("&([a-z0-9])","§$1");
		}
		
		// sc Command Usage
		if(cmd.getName().equalsIgnoreCase("sc") && sender.hasPermission("staffchatplus.use") && args.length==0)
		{
			sender.sendMessage(prefix + "Usage: /sc <message>");
			return true;
		}
		// sc Send Message
		else if(cmd.getName().equalsIgnoreCase("sc") && sender.hasPermission("staffchatplus.use") && args.length>0)
		{
			Bukkit.getServer().broadcast( prefix + name + ": " + text , "staffchatplus.use");
			return true;
		}
		return false;
	}
}
