package exc_17082024;

public class All_EXception_Example {
    public static void main (String[] args) {


        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 1000;
        } catch (NumberFormatException  | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End the program");
    }

}
