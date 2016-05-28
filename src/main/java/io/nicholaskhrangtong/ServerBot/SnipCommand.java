package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class SnipCommand implements CommandExecutor
{
    private final Plugin plugin;
    private final ChatListener chatListener;
    private final ColorCodesHandler colorCodesHandler;

    private String messageToCheck;
    private String changedMessage;

    public SnipCommand(ChatListener chatListener, Plugin plugin)
    {
        this.chatListener = chatListener;
        this.plugin = plugin;
        this.colorCodesHandler = new ColorCodesHandler();
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.snip"))
        {
            messageToCheck = chatListener.getMessage();

            if (messageToCheck.contains(args[0]))
            {
                changedMessage = messageToCheck.replaceAll(args[0], args[1]);
                Bukkit.broadcastMessage(colorCodesHandler.replaceColorCodes(plugin.getConfig().getString("bot-name"))
                        + " " + ChatColor.WHITE + "Correction, @" + chatListener.getPlayer().getDisplayName() + " " + changedMessage);
            }
        }
        return false;
    }
}
