package io.nicholaskhrangtong.ServerBot.controllers;

import org.bukkit.plugin.Plugin;

import java.io.File;

public class DataFileHandler
{
    private DataFileHandler() {}
    static DataFileHandler dataFileHandler = new DataFileHandler();

    public static DataFileHandler getInstance()
    {
        return dataFileHandler;
    }

    Plugin plugin;
    File configFile;

    public void setup(Plugin plugin)
    {
        try {
            if (!plugin.getDataFolder().exists())
            {
                plugin.getDataFolder().mkdirs();
            }
            File configFile = new File(plugin.getDataFolder(), "config.yml");
            if (!configFile.exists())
            {
                plugin.getLogger().info("Config.yml not found, creating!");
                plugin.saveDefaultConfig();
            }
            else
            {
                plugin.getLogger().info("Config.yml found, loading!");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
