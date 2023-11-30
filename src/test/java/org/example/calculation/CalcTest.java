package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testScitani(){
        int actual = Calc.secti(3,6);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }
}
