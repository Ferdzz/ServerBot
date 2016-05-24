package io.nicholaskhrangtong.ServerBot;

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
        getCommand("eightball").setExecutor(new EightballCommand());
        getCommand("coin").setExecutor(new CoinCommand());
        getCommand("spin").setExecutor(new BottleCommand());
    }

    @Override
    public void onDisable()
    {
        getLogger().info("ServerBot has been deactivated!");
    }
}
