package exc_21072024;

import java.util.Scanner;

public class Lab053 {

    public static void main(String[] args) {
        // FizzBuzz Problem:
        // Write a program that prints number from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i=1; i<=20; i++) {
            if (i%3==0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            }
            else if (i %3==0 || i % 5 ==0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Nothing Print");
            }
            }
        }

    }

