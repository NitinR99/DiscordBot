import events.Brain;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Bot
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader (new FileReader("keys.txt") ) ;
        String mykey=br.readLine().strip();
        JDA jda = new JDABuilder(mykey).build();
        jda.addEventListener(new Brain());
    }
}
