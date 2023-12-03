package org.example.calculation;

import java.util.ArrayList;
import java.util.List;

public class Find {

    public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit){
        for (Double item : list){
            if (item >= lowerLimit && item<=upperLimit){
                return item;
            }
        }
        return null;
    }

    public static Double findMatching2(List<Double> list, Double lowerLimit, Double upperLimit){
        for (Double item : list){
            if (item >= lowerLimit && item<=upperLimit){
                return item;
            }
        }
        return null;
    }
}
