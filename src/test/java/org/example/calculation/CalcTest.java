package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testScitani(){
        int actual = Calc.secti(3,6);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testDeleni(){
        int actual = Calc.vydel(10,5);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Násobení dvou čísel")
    public void testNasobeni(){
        int actual = Calc.vynasob(6,5);
        int expected = 30;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Dělení nulou")
    public void testDeleniNulou(){
        Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> Calc.vydel(11,0));

        Assertions.assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test součtu čísel, která se nerovnají nule")
    public void testSoucetVetsiNezNula(){
        int actual = Calc.secti(10,15);
        int expected = 0;

        Assertions.assertTrue(actual > expected);
    }

}
