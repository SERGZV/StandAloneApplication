package main.java.ru.stand.alone.application;

import java.util.Date;

public class Program
{
    public void main()
    {
        System.out.println("Введите строку которую следует инвертировать:");
        System.out.println();

        String userInput = System.console().readLine();
        System.out.println();

        System.out.println("Ваша строка: " + userInput);
        System.out.println("Инвертированная строка: " + invertString(userInput));
        System.out.println();

        outputResultForInversions(1000, userInput);
        outputResultForInversions(10000, userInput);
        outputResultForInversions(100000, userInput);

        System.out.println("Чтобы выйти нажмите на крестик в верхнем правом углу консоли.");

        while (true) System.console().readLine();
    }

    private void outputResultForInversions(int repeatCounts, String userInput)
    {
        long timeSpan = measureTimeInversionsForTimes(repeatCounts, userInput);
        System.out.println(repeatCounts + " инвертирований произвелось за: " + timeSpan + " мс.");
        System.out.println();
    }

    private long measureTimeInversionsForTimes(int repeatCounts, String invertedString)
    {
        long measureStart;
        long measureEnd;

        measureStart = new Date().getTime();
        invertTimes(repeatCounts, invertedString);
        measureEnd = new Date().getTime();

        return measureEnd - measureStart;
    }

    private void invertTimes(int repeatCounts, String invertedString)
    {
        for (int i = 0; i < repeatCounts; i++)
            invertString(invertedString);
    }

    private String invertString(String stringToInvert)
    {
        StringBuilder sb = new StringBuilder(stringToInvert);
        return sb.reverse().toString();
    }
}
