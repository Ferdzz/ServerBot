package io.nicholaskhrangtong.ServerBot;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class RollCommand implements CommandExecutor
{
    private Random random = new Random();

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        Player p = (Player) sender;
        if (p.hasPermission("serverbot.roll"))
        {
            if (args.length == 0)
            {
                p.sendMessage(ChatColor.RED + "You must specify an upper-bound number!");
                return true;
            }
            else
            {
                int desiredUpperBound = Integer.parseInt(args[0]);
                int generatedNumber = random.nextInt(desiredUpperBound);
                p.sendMessage("You rolled " + generatedNumber + " out of " + desiredUpperBound);
                return true;
            }
        }
        return false;
    }
}
