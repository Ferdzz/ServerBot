package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SnipCommand implements CommandExecutor
{

    private final ChatListener chatListener;
    private String messageToCheck;
    private String changedMessage;

    public SnipCommand(ChatListener chatListener)
    {
        this.chatListener = chatListener;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.snip"))
        {
            messageToCheck = chatListener.getMessage();
            if (messageToCheck.contains(args[0]))
            {
                changedMessage = messageToCheck.replaceAll(args[0], args[1]);
                sender.sendMessage(ChatColor.GOLD + "[ServerBot] " + ChatColor.WHITE + "Correction, @" +
                        chatListener.getPlayer().getDisplayName() + " " + changedMessage);
            }
        }

        return false;
    }
}
