package exc_200720224;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        //if (num = 0) {
          //  System.out.println("This is 0");

         if(number> 0) {
            System.out.println("Number is positive");
        } else if(number < 0) {
            System.out.println("Number is Negative");

        } else {
             System.out.println("Number is Zero");
         }
    }
    }

