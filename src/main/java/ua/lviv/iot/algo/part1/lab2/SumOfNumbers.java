package ua.lviv.iot.algo.part1.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SumOfNumbers {

    private static final Pattern ALL_POSITIVE_NUMBERS = Pattern.compile("-?\\d+");

    public int positiveNumberSum(final String text) {
        Matcher matcher =ALL_POSITIVE_NUMBERS.matcher(text);
        int sumOfNumbers = 0;

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            if (number > 0) {
                sumOfNumbers += number;
            }
        }
        return sumOfNumbers;
    }
}
