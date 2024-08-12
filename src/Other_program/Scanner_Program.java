package Other_program;

import java.util.Scanner;

public class Scanner_Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int a = sc.nextInt();
        System.out.println("output of A" +a);

        System.out.println("Enter a flot");
        float b = sc.nextFloat();
        System.out.println("output of B" + b);

        System.out.println("Enter a string");
         String c = sc.next().toString();
        System.out.println("output of C" + c);

    }
}
