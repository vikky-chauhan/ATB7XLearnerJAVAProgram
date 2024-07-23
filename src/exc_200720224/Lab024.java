package exc_200720224;

import java.util.Scanner;

public class Lab024 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        if (num2 > num1) {
            System.out.println("num2 is big");
        } else if (num1 > num2) {
            System.out.println("num1 is big");
        } else {
            System.out.println("nothing print");
        }

    }
}
