package main.java.ru.stand.alone.application;

import java.io.IOException;

public class Main
{
    public static void main (String [] args) throws IOException
    {
        if(System.console() == null) restartAppWithConsole();
        else
        {
            Program program = new Program();
            program.main();
        }
    }

    private static void restartAppWithConsole() throws IOException
    {
        String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
        Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
    }
}
