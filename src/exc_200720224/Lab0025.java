package exc_200720224;

import java.util.Scanner;

public class Lab0025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1");
        int num1 = sc.nextInt();

        System.out.println("Enter a number2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is big");
        } else if (num2 > num1) {
            System.out.println("num2 is big");
        }else{
            System.out.println("Nothing print");

        }
    }
}
