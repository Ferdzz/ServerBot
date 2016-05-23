package io.nicholaskhrangtong.ServerBot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class CoinCommand implements CommandExecutor
{

    private final Random random = new Random();
    private final String headsUp = "heads";
    private final String tailsUp = "tails";

    public String CoinToss()
    {
        int sideIndicator = random.nextInt(2);
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
            sender.sendMessage(ChatColor.GREEN + "The coin landed on " + ChatColor.WHITE + CoinToss());
            return true;
        }

        return false;
    }
}
