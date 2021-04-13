package fr.quentin.tutorialbot.commands;

import fr.quentin.tutorialbot.utils.commandmanager.iCommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;

public class TestCommand implements iCommand {
    @Override
    public void invoke(String[] args, Message m) {
        m.reply("Bonsoir je marche").queue();
    }

    @Override
    public EmbedBuilder getHelp() {
        return null;
    }
}
