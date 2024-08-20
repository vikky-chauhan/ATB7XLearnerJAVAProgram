package exc_17082024;

public class Example_1 {
    public static void main(String[] args) {

        // Convert the  value String to Integer from Integer

        String num = "10";

        Integer a1 = Integer.valueOf(num); // Here Integer is Wrapper Class and valueOf is Static function
        System.out.println(a1);


        // String to Primitive

        int a2 = Integer.parseInt(num); //Here Integer is Wrapper Class and parseInt is Static function
        System.out.println(a2);

    }
}
