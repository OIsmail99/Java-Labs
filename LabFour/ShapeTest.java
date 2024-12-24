package LabFour;

import java.util.List;

public class ShapeTest {
    public static <T extends Shape> void gen(List<T> shape) {
        for (T t : shape) {
            t.draw();
        }
    }
}
