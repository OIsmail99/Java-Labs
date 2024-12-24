package LabFour;

public class Call {
    public static void call() {
        try {
            Test.foo1();
            Test.foo2();
            Test.foo3();
        } catch (OsamaException e) {
            System.out.println(e.getMessage());
        }
    }
}
