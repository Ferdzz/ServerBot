package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

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
