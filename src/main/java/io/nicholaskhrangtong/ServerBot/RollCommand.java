package io.nicholaskhrangtong.ServerBot;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class RollCommand implements CommandExecutor
{
    private Random random = new Random();
    private int desiredUpperBound;
    private int generatedNumber;

    public boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        catch (NullPointerException e)
        {
            return false;
        }
        return true;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.roll"))
        {
            if (args.length == 0)
            {
                sender.sendMessage(ChatColor.RED + "You must specify an upper-bound number!");
                return true;
            }
            else
            {
                try
                {
                    desiredUpperBound = Integer.parseInt(args[0]);
                    generatedNumber = random.nextInt(desiredUpperBound) + 1;
                    Bukkit.broadcastMessage(sender.getName() + " rolled " + generatedNumber + " out of " + desiredUpperBound);
                    return true;
                }
                catch (NumberFormatException e)
                {
                    sender.sendMessage("You must enter an integer!");
                    return false;
                }
            }
        }
        return false;
    }
}
