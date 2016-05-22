package io.nicholaskhrangtong.ServerBot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ByeCommand implements CommandExecutor {

    private String byeLink = "http://cdn.photonesta.com/images/avvesione.files.wordpress.com/2013/04/to_aru_kagaku_no_railgun_s-02-misaka-happy-waving_goodbye-heroine-protagonist-cute.jpg";

    private String getByeLink()
    {
        return byeLink;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        Player p = (Player) sender;
        if (p.hasPermission("serverbot.bye"))
        {
            p.sendMessage(getByeLink());
            return true;
        }
        return false;
    }
}
