package exc_200720224;

import java.util.Scanner;

public class Lab023 {

    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);

        System.out.println("Enter a number");
        int user_input = abc.nextInt();

        if (user_input % 2 == 0){
            System.out.println("even number");
    } else {
        System.out.println("odd number");
    }
    }
}
