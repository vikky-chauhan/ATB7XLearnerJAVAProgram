package exc_200720224;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input=sc.nextInt();

        if (user_input%2==0) {
            System.out.println("this is even number");
        } else {
            System.out.println("this is odd number");
        }
    }
}
