package fr.quentin.tutorialbot.events;

import fr.quentin.tutorialbot.utils.commandmanager.CommandManager;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Message extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {

        if(event.getAuthor().isBot()) return;
        if(!event.getMessage().getContentRaw().startsWith("!")) return;

        User u = event.getAuthor();
        String m = event.getMessage().getContentRaw();

        String[] content = m.split(" ");
        String command = content[0].replace("!", "");
        String[] args = Arrays.copyOfRange(content, 1, content.length);

        CommandManager.startCommand(command, args, event.getMessage());
        return;

    }
}
