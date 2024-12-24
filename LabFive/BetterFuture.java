package LabFive;
import java.util.function.*;

public class BetterFuture {
    public static String betterString(String first, String second, BiPredicate<String,String> lambda){
        if( lambda.test(first, second) == true) return first;
        return second;
    }
}
