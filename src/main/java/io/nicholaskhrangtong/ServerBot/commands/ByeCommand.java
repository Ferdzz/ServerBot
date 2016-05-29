package io.nicholaskhrangtong.ServerBot.commands;

import io.nicholaskhrangtong.ServerBot.controllers.ColorCodesHandler;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ByeCommand implements CommandExecutor
{
    private final ColorCodesHandler colorCodesHandler;
    private final Plugin plugin;

    private final String byeLink;

    public ByeCommand(Plugin plugin)
    {
        this.plugin = plugin;
        this.colorCodesHandler = new ColorCodesHandler();

        this.byeLink = "https://i.ytimg.com/vi/7uOwEQWbmeU/hqdefault.jpg";
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.bye"))
        {
            sender.sendMessage(colorCodesHandler.replaceColorCodes(plugin.getConfig().getString("bot-name")) +
                    ChatColor.WHITE + " " + this.byeLink);
            if (sender instanceof Player)
            {
                Player p = (Player) sender;
                p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE, 1, 0);
            }
            return true;
        }
        return false;
    }
}
