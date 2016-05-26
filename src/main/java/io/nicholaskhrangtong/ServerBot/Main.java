package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{

    private final ChatListener chatListener;

    public Main ()
    {
        this.chatListener = new ChatListener();
    }

    @Override
    public void onEnable()
    {
        getLogger().info("ServerBot has been activated!");

        getCommand("bye").setExecutor(new ByeCommand());
        getCommand("roll").setExecutor(new RollCommand());
        getCommand("eightball").setExecutor(new EightballCommand());
        getCommand("coin").setExecutor(new CoinCommand());
        getCommand("spin").setExecutor(new BottleCommand());
        getCommand("snip").setExecutor(new SnipCommand(chatListener));

        Bukkit.getServer().getPluginManager().registerEvents(chatListener, this);
    }

    @Override
    public void onDisable()
    {
        getLogger().info("ServerBot has been deactivated!");
    }
}
