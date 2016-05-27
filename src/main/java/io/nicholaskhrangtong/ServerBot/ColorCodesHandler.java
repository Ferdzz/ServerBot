package io.nicholaskhrangtong.ServerBot;

import org.bukkit.ChatColor;

/**
 * Created by Nicholas Khrangtong on 5/27/2016.
 */
public class ColorCodesHandler
{
    public static String replaceColorCodes(String message)
    {
        for (ChatColor color : ChatColor.values())
        {
            message = message.replaceAll(String.format("&%c", color.getChar()), color.toString());
        }
        return message;
    }
}
