package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.*;


public class BottleCommand implements CommandExecutor
{

    private List<String> onlinePlayers = new ArrayList<String>();
    private Random random = new Random();
    private String bottledPlayer;
    private String playerOne;
    private String playerTwo;

    private final Plugin plugin;
    private final ColorCodesHandler colorCodesHandler;

    public BottleCommand(Plugin plugin)
    {
        this.plugin = plugin;
        this.colorCodesHandler = new ColorCodesHandler();
    }

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
            Bukkit.broadcastMessage(colorCodesHandler.replaceColorCodes(plugin.getConfig().getString("bot-name")) + ChatColor.WHITE
                    + sender.getName() + " spun the bottle and it landed on...." + ChatColor.GREEN + playerOne
                    + ChatColor.WHITE + " and " + ChatColor.GREEN + playerTwo);
        }

        return false;
    }
}
