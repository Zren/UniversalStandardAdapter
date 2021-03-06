package de.xzise.usa.adapters.permission;

import org.bukkit.command.CommandSender;

import de.xzise.usa.adapters.Adapter;

public interface PermissionAdapter extends Adapter {

	boolean hasPermission(CommandSender sender, String node);
	boolean hasPermission(String name, String node); //In case the target isn't online for some reason.
	
	String getGroup(String name);
}
