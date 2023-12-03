package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindTest {

    List<Double> testList;
    @BeforeEach
    public void setUp() {
        testList = List.of(12.0, 8.126, 6.0);
    }

    @Test
    @DisplayName("První vlastní test")
    public void findMatching(){
       Double testResult = Find.findMatching(testList, 11.0, 12.6);
       Double expected = 12.0;

        Assertions.assertEquals(expected, testResult);
    }

    List<Double> testList2;
    @BeforeEach
    public void setTestList2() {
        testList2 = List.of(12.0, 8.126, 158.0, 9.0, 6.0);
    }

    @Test
    @DisplayName("Druhý vlastní test")
    public void findMatching2(){
        Double testResult = Find.findMatching(testList2, 8.0, 10.0);
        Double expected = 8.126;

        Assertions.assertEquals(expected, testResult);
    }
}
