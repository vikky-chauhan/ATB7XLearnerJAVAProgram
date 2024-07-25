package exc_21072024;

public class Lab045 {
    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            System.out.println(i);

            if (i==5) {
                continue;
            }
            System.out.println("After!!");
        }
    }
}
