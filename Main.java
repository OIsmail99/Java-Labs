// public class OsamaException extends Exception {

//     public OsamaException(String message) {
//         super(message);
//     }

// }
// public class Test {

//     public static void foo1() throws OsamaException {
//         throw new OsamaException("OsamaException thrown from foo1");
//     }

//     public static void foo2() throws OsamaException{
//         throw new OsamaException("OsamaException thrown from foo2");
//     }
//     public static void foo3() throws OsamaException{
//       throw new OsamaException("OsamaException thrown from foo3");
//     }

// }

import LabFive.Alphabets;
import LabFour.OsamaException;
import LabFour.Test;

import java.util.List;
import java.util.ArrayList;

import LabFour.Call;
import LabFour.Rectangle;
import LabFour.Shape;
import LabFour.Circle;
import LabFour.ShapeTest;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        boolean[] bools = new boolean[4];
        bools[0] = Alphabets.containsOnlyAlphabets("text");
        bools[1] = Alphabets.containsOnlyAlphabets("some spaces");
        bools[2] = Alphabets.containsOnlyAlphabets("0sama");
        bools[3] = Alphabets.containsOnlyAlphabets("t%st");
        for (int i = 0; i < 4; i++)
            System.out.println(bools[i]);
    }

}
