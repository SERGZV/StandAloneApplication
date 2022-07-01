package main.java.ru.stand.alone.application;

import java.awt.*;
import java.io.Console;
import java.io.IOException;

public class Main
{
    public static void main (String [] args) throws IOException
    {
        System.out.println("HelloWorld");


        String testFilePath = "E:/Test/StandAloneApplication.jar";


        Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + testFilePath + "\""});
            System.out.println("Тест");
        }else{
//            TestClass.main(new String[0]);
//            System.out.println("Program has ended, please type 'exit' to close the console");
        }
    }
}
