package io.nicholaskhrangtong.ServerBot.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener
{
    private String message;
    private Player player;

    @EventHandler
    public void onAsyncChatEvent(AsyncPlayerChatEvent e)
    {
        this.message = e.getMessage();
        this.player = e.getPlayer();
    }

    public String getMessage() {
        return message;
    }

    public Player getPlayer() {
        return player;
    }
}
