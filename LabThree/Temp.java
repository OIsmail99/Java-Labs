package LabThree;

import java.util.function.*;

public class Temp implements Function<Double, Double> {

    @Override
    public Double apply(Double centigrade) {
        Double fahrenheit = (centigrade * 1.8) + 32;
        return fahrenheit;
    }

}