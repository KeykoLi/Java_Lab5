package ua.lviv.iot.algo.part1.lab2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public int positiveNumberSum(String text) {
        int sum = 0;
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            if (num > 0) {
                sum += num;
            }
        }
        System.out.print("\nСума:"+ sum);
        return sum;
    }

    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        Main Text = new Main();
        Text.positiveNumberSum(text);

    }
}
