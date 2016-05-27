package io.nicholaskhrangtong.ServerBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class DataFileHandler
{
    private DataFileHandler()	{}
    static DataFileHandler instance = new DataFileHandler();

    public static DataFileHandler getInstance()
    {
        return instance;
    }

    Plugin plugin;
    FileConfiguration config;
    File configFile;

    public void setup(Plugin plugin)
    {
        config = plugin.getConfig();
        config.options().copyDefaults(true);
        configFile = new File(plugin.getDataFolder(), "config.yml");
        saveConfig();
    }

    public FileConfiguration getConfig()
    {
        return config;
    }

    public void saveConfig()
    {
        try
        {
            config.save(configFile);
        }
        catch (IOException e)
        {
            Bukkit.getServer().getLogger().severe(ChatColor.RED + "Unable to save config.yml!");
        }
    }
}
