package exc_17082024;

public class Wrapper_Example {
    public static void main(String[] args) {
     // primitive to Wrapper Class

        int a=10;
        Integer a1=a;
        System.out.println(a); // Not Added Extra Utilities
        System.out.println(a1); // Extra Utilities are Added

        // Wrapper Class to Primitive
        Integer a2 = 10; // Auto Boxing - Int to Integer
        int value = a2; // Unboxing - Integer to Int
        System.out.println(a2); // Extra Utilities are Added
        System.out.println(value); // Not Added Extra Utilities



    }
}
