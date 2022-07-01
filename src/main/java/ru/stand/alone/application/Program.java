package main.java.ru.stand.alone.application;

import java.util.Scanner;

public class Program
{
    public void main()
    {
        System.out.println("Введите строку которую следует инвертировать:");

        Scanner scanner = new Scanner(System.in);

        String userInput = System.console().readLine();
        System.out.println("Ваша строка: " + invertString(userInput));



    }

    private String invertString(String stringToInvert)
    {
        StringBuilder sb = new StringBuilder(stringToInvert);
        return sb.reverse().toString();
    }
}
