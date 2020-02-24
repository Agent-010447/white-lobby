package fr.agent040147.whitelobby;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.ChatColor;


public class CommandLobby extends Command {
    public CommandLobby(String name) {
        super(name, "lobby.whitelobby");
    }

    @SuppressWarnings("deprecation")
	@Override
    public void execute(CommandSender sender, String[] arg) {
        Map<String, ServerInfo> servers = ProxyServer.getInstance().getServers();
        if (!(sender instanceof ProxiedPlayer)) {
            return;
        }
        ProxiedPlayer player = (ProxiedPlayer)sender;
        if (args.length != 0) {
            player.sendMessage("Commande inconue !");
            return;
        }
        ServerInfo server = servers.get("lobby01");
        if (server == null) {
           player.sendMessage(ProxyServer.getInstance().getTranslation("no_server"));
        }
        else if (!server.canAccess(player)) {
           player.sendMessage(ProxyServer.getInstance().getTranslation("no_server_permission"));
        }
        else {
            player.connect(server, ServerConnectEvent.Reason.COMMAND);
        }
    }
}
