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
import java.util.function.*;
import LabThree.*;
import LabFour.*;
import LabFive.*;

public class Main {

    public static void main(String[] args) {
        BiPredicate<String, String> bi = (x, y) -> x.length() >= y.length();
        // for me, the better String is the longer one.
        String str = BetterFuture.betterString("Osama", "Ismail", bi);
        System.out.println(str); // Ismail
    }

}
