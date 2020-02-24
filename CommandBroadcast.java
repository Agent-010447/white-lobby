package fr.agent040147.whitelobby;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class CommandBroadcast extends Command {

	public CommandBroadcast(String name) {
		super(name, "bcbg.whitelobby");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		
	if(args.length == 0) {
			sender.sendMessage(new TextComponent("Veuillez taper /bc (votre message)"));
	}
	if(args.length >=1){
		StringBuilder bcbg = new StringBuilder();
		for(String part : args) {
			bcbg.append(part + "");
		}
		
		ProxyServer.getInstance().broadcast(new TextComponent("[ANNONCE] : " + bcbg.toString()));
		
	}
	
	}
}
