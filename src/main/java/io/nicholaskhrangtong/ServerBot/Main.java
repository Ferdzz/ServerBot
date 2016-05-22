package io.nicholaskhrangtong.ServerBot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{

    private final ByeCommand bye;

    public Main()
    {
        this.bye = new ByeCommand();
    }

    @Override
    public void onEnable()
    {
        getLogger().info("ServerBot has been activated!");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("ServerBot has been deactivated!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("bye"))
        {
            if (p.hasPermission("serverbot.bye"))
            {
                p.sendMessage(bye.getByeLink());
            }
        }

        return false;
    }
}
