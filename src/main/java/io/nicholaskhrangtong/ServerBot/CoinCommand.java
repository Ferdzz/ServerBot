package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class CoinCommand implements CommandExecutor
{
    private final Plugin plugin;
    private final ColorCodesHandler colorCodesHandler;

    private final String headsUp = "heads";
    private final String tailsUp = "tails";

    private final Random random = new Random();
    private int sideIndicator;

    public CoinCommand(Plugin plugin)
    {
        this.plugin = plugin;
        this.colorCodesHandler = new ColorCodesHandler();
    }

    public String CoinToss()
    {
        this.sideIndicator = random.nextInt(2);
        if (sideIndicator == 0)
        {
            return headsUp;
        }
        else
        {
            return tailsUp;
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.coin"))
        {
            Bukkit.broadcastMessage(colorCodesHandler.replaceColorCodes(plugin.getConfig().getString("bot-name")) + " "
                    + ChatColor.GREEN + sender.getName() + " flipped a coin!" + "The coin landed on " + ChatColor.WHITE + CoinToss());
            return true;
        }
        return false;
    }
}
