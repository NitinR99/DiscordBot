package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Brain extends ListenerAdapter
{
    public void onGuildMessageReceived(GuildMessageReceivedEvent e)
    {
        if(!e.getMember().getUser().isBot())
        {
            String[] message = e.getMessage().getContentRaw().split(" ");
            if (message[0].charAt(0)=='~')
            {
                if(message[0].equalsIgnoreCase("~hi") || message[0].equalsIgnoreCase("~hello"))
                {
                    e.getChannel().sendMessage(e.getMember().getAsMention()+" Hello!").queue();
                }
                if(message[0].equalsIgnoreCase("~ineedmemes") || message[0].equalsIgnoreCase("~giveittome"))
                {
                    e.getChannel().sendMessage(e.getMember().getAsMention()+" My plug is out of town rn, maybe later.").queue();
                }
            }
        }
    }
}
