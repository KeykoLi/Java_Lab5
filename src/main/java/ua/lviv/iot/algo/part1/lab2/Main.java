package ua.lviv.iot.algo.part1.lab2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {

    public  int positiveNumberSum(final String text) {
        int sum = 0;
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            if (num > 0) {
                sum += num;
            }
        }
        System.out.print("\nСума:" + sum);
        return sum;
    }

    public static void main(final String[]  args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        Main ProcessedText = new Main();
        ProcessedText.positiveNumberSum(text);

    }
}
