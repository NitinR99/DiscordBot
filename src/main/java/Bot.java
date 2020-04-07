import events.Brain;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot
{
    public static void main(String args[]) throws Exception{

        JDA jda = new JDABuilder("Njk2OTUyNzgwNDgwNTc3NTg4.XowOCg.X-6hYrvySXMGFVAjzodz9g0nqUY").build();
        jda.addEventListener(new Brain());
    }
}
