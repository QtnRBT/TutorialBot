package fr.quentin.tutorialbot;

import fr.quentin.tutorialbot.utils.commandmanager.CommandManager;
import fr.quentin.tutorialbot.commands.TestCommand;
import fr.quentin.tutorialbot.events.Message;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException, InterruptedException {

        CommandManager.addCommand("test", new TestCommand());

        JDA jda = JDABuilder.createDefault("ODMxNTQ1MTU4NDY5OTQzMjk3.YHWyxw.xQuIunyWF-YWwRlWtT2dHPKW-UU")
                .addEventListeners(new Message())
                .build();

        jda.awaitReady();
    }

}
