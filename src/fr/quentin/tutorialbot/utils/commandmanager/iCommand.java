package fr.quentin.tutorialbot.utils.commandmanager;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;

public interface iCommand {

    void invoke(String[] args, Message m);
    EmbedBuilder getHelp();

}
