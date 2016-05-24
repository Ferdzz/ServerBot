package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BottleCommand implements CommandExecutor
{

    private List<String> onlinePlayers = new ArrayList<String>();
    private Random random = new Random();
    private String bottledPlayer;
    private String playerOne;
    private String playerTwo;

    public String getBottledPlayer()
    {
        int index = random.nextInt(onlinePlayers.size());
        bottledPlayer = onlinePlayers.get(index);

        return bottledPlayer;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            onlinePlayers.add(p.getDisplayName());
        }

        if (onlinePlayers.size() == 1)
        {
            sender.sendMessage("You are the only person in the server!");
            return true;
        }
        else
        {
            playerOne = getBottledPlayer();
            playerTwo = getBottledPlayer();
            while (playerOne == playerTwo)
            {
                playerTwo = getBottledPlayer();
            }
            sender.sendMessage(ChatColor.GOLD + "[ServerBot] " + ChatColor.WHITE + sender.getName() +
                    " spun the bottle and it landed on...." + ChatColor.GREEN + playerOne + ChatColor.WHITE + " and "
                    + ChatColor.GREEN + playerTwo);
        }

        return false;
    }
}
