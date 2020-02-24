package fr.agent040147.whitelobby;

import net.md_5.bungee.api.plugin.Plugin;

public class WhiteLobby extends Plugin {

	@Override
	public void onEnable() {
		System.out.println("plugin ON");
		getProxy().getPluginManager().registerCommand(this, new CommandLobby("lobby"));
		getProxy().getPluginManager().registerCommand(this, new CommandBroadcast("bcbg"));
	}

	public void OnDisable() {
		System.out.println("plugin OFF");
		
	}
		

	
}
