package io.nicholaskhrangtong.ServerBot.controllers;

import org.bukkit.ChatColor;

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
