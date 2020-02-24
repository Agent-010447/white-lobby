package fr.agent040147.whitelobby;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.ChatColor;

public class CommandLobby extends Command {




	private static String lobby01;
	private static final String lobbyprincipal = lobby01;

	public CommandLobby(String name) {
		super(name, "lobby.whitelobby");
	}

	@Override
	public void execute(CommandSender sender, String[] arg) {
		if(sender instanceof ProxiedPlayer) {
			ProxiedPlayer player = (ProxiedPlayer) sender;
			player.sendMessage(new TextComponent("Envoi vers le lobby principal !"));
			player.connect(ProxyServer.getInstance().getServerInfo(lobbyprincipal));
		}

	}

}
