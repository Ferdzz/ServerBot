package io.nicholaskhrangtong.ServerBot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ByeCommand implements CommandExecutor
{
    private final String byeLink;
    
    public ByeCommand()
    {
        this.byeLink = "http://cdn.photonesta.com/images/avvesione.files.wordpress.com/2013/04/to_aru_kagaku_no_railgun_s-02-misaka-happy-waving_goodbye-heroine-protagonist-cute.jpg";
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.bye"))
        {
            sender.sendMessage(this.byeLink);    
            return true;
        }
        return false;
    }
}
