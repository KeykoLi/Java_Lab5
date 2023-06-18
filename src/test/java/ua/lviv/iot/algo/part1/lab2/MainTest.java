package ua.lviv.iot.algo.part1.lab2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    Main m;
    String text;

    @BeforeEach
    void setUp(){
         m = new Main();
    }

    @Test
    public  void testPositiveNumberSum(){
        text = "AVB dkff -2 kfkjd 20 jfie 5 -10 kjd 15";
        int expectedSum = 40;
        int actualSum = m.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testEmptyText(){
        text = "";
        int expectedSum = 0;
        int actualSum = m.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testNoPositiveNumbers() {
        text = "FKLDKF jfkkgp ;wksm leyrt;klg .";
        int expectedSum = 0;
        int actualSum = m.positiveNumberSum(text);
        assertEquals(expectedSum, actualSum);
    }

}