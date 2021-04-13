package fr.quentin.tutorialbot.utils.commandmanager;

import net.dv8tion.jda.api.entities.Message;

import java.util.HashMap;

public class CommandManager {

    private static HashMap<String, iCommand> allCommands = new HashMap<>();

    public static void startCommand(String name, String[] args, Message m) {
        try {
            getCommand(name).invoke(args, m);
        } catch (NullPointerException e) {
            m.reply("This command doesn't exist.").queue();
        }
    }

    public static void addCommand(String name, iCommand commandExecutor) {
        allCommands.put(name, commandExecutor);
    }
    public static iCommand getCommand(String name) {
        return allCommands.get(name);
    }

}
