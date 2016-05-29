package io.nicholaskhrangtong.ServerBot;

import io.nicholaskhrangtong.ServerBot.commands.*;
import io.nicholaskhrangtong.ServerBot.controllers.DataFileHandler;
import io.nicholaskhrangtong.ServerBot.listeners.ChatListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    private final ChatListener chatListener;
    private final DataFileHandler dataFileHandler;

    public Main ()
    {
        this.chatListener = new ChatListener();
        this.dataFileHandler = DataFileHandler.getInstance();
    }

    @Override
    public void onEnable()
    {
        dataFileHandler.setup(this);

        getCommand("bye").setExecutor(new ByeCommand(this));
        getCommand("roll").setExecutor(new RollCommand(this));
        getCommand("eightball").setExecutor(new EightballCommand());
        getCommand("coin").setExecutor(new CoinCommand(this));
        getCommand("spin").setExecutor(new BottleCommand(this));
        getCommand("snip").setExecutor(new SnipCommand(chatListener, this));

        Bukkit.getServer().getPluginManager().registerEvents(chatListener, this);
    }

    @Override
    public void onDisable()
    {
        saveConfig();
    }
}
