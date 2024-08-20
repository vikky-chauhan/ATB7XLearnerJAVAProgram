package exc_17082024;

public class Exception_example {

    public static void main (String[] args) {

        int c= 2;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("// devide by 0 ");
        }
        System.out.println(c);
        System.out.println("END");

    }
}
