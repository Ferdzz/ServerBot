package io.nicholaskhrangtong.ServerBot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class EightballCommand implements CommandExecutor
{

    private final String[] eightballAnswers = {
            "Signs point to yes.",
            "Yes.",
            "Reply hazy, try again.",
            "Without a doubt",
            "My sources say no.",
            "As I see it, yes.",
            "You may rely on it.",
            "Concentrate and ask again.",
            "Outlook not so good.",
            "It is decidedly so.",
            "Better not tell you now.",
            "Very doubtful.",
            "Yes, definitely.",
            "It is certain.",
            "Cannot predict now.",
            "Most likely.",
            "Ask again later.",
            "My reply is no.",
            "Outlook good",
            "Don't count on it."
    };

    private final Random random = new Random();
    private String answer;
    private String question;

    public String getAnswer()
    {
        int index = random.nextInt(eightballAnswers.length);
        answer = eightballAnswers[index];

        return answer;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.hasPermission("serverbot.eightball"))
        {
            sender.sendMessage(ChatColor.GOLD + "[Eightball] " + ChatColor.GRAY + "answered: " + ChatColor.WHITE + getAnswer());
            return true;
        }

        return false;
    }
}
