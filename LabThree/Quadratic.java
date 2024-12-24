package LabThree;

//import java.util.Arrays;
import java.util.function.*;

public class Quadratic implements Function<double[], double[]>, Predicate<double[]> {

    private double[] print(double[] constants) {
        double a = constants[0];
        double b = constants[1];
        double c = constants[2];
        double d = (b * b) - (4 * a * c);

        double x_pos = (-b + Math.sqrt(d)) / (2 * a);
        double x_neg = (-b - Math.sqrt(d)) / (2 * a);
        double[] res = { x_pos, x_neg };
        return res;
    }

    // public double[] compute(double[] constants) {
    // if (test(constants) == true) {
    // return apply(constants);
    // }
    // return null;

    // }

    @Override
    public double[] apply(double[] constants) {
        if (test(constants) == true) {
            return (print(constants));
        }
        return null;
    }

    @Override
    public boolean test(double[] constants) {

        if (constants.length != 3)
            throw new IllegalArgumentException("send only three numbers");

        if (constants[0] == 0)
            throw new IllegalArgumentException("a can't be 0");
        // return false;
        double upper = (constants[1] * constants[1]) - 4 * (constants[0] * constants[2]);
        if (upper < 0)
            throw new IllegalArgumentException("Imaginary number");

        return true;
    }

    // public static void main(String[] args) {
    // Quadratic quad = new Quadratic();
    // double a = 2;
    // double b = 4;
    // double c = -6;
    // double[] constants = { a, b, c };
    // if (quad.test(constants) == true) {
    // System.out.println(Arrays.toString(quad.apply(constants)));
    // } else if (constants[0] == 0) {
    // System.out.println("a can't be 0");
    // } else {
    // System.out.println("Can't square root a negative number");
    // }
    // }
}
