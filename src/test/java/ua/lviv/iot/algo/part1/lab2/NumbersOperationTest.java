package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumbersTest {

    private Main SumOfNumbers;
    private String text;
    private int actualSum;
    private int expectedSum;

    @BeforeEach
    void setUp() {
        SumOfNumbers = new Main();
    }

    @Test
    public void testPositiveNumberSum() {
        text = "AVB dkff -2 kfkjd 20 jfie 5 -10kjd 15";
        expectedSum = 40;
        actualSum = SumOfNumbers.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testEmptyText() {
        text = "";
        expectedSum = 0;
        actualSum = SumOfNumbers.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testNoPositiveNumbers() {
        text = "FKLDKF jfkkgp ;wksm leyrt;klg .";
        expectedSum = 0;
        actualSum = SumOfNumbers.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }
}
