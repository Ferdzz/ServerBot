package io.nicholaskhrangtong.ServerBot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    @Override
    public void onEnable()
    {
        getLogger().info("ServerBot has been activated!");

        getCommand("bye").setExecutor(new ByeCommand());
        getCommand("roll").setExecutor(new RollCommand());
    }

    @Override
    public void onDisable()
    {
        getLogger().info("ServerBot has been deactivated!");
    }
}
