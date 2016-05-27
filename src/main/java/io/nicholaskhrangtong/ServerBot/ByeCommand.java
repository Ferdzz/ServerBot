package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ByeCommand implements CommandExecutor
{
    private final String byeLink;
    private final Plugin plugin;
    private final ColorCodesHandler colorCodesHandler;

    public ByeCommand(Plugin plugin)
    {
        this.byeLink = "https://i.ytimg.com/vi/7uOwEQWbmeU/hqdefault.jpg";
        this.plugin = plugin;
        this.colorCodesHandler = new ColorCodesHandler();
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.bye"))
        {
            sender.sendMessage(colorCodesHandler.replaceColorCodes(plugin.getConfig().getString("bot-name")) +
                    ChatColor.WHITE + " " + this.byeLink);
            return true;
        }
        return false;
    }
}
