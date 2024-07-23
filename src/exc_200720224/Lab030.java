package exc_200720224;

import java.util.Scanner;

public class Lab030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days 1 to 7");
        int days = sc.nextInt();

        switch (days) {
            case 1:
            System.out.println("Mon");
            break;
            case 2:
            System.out.println("Tue");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("Thur");
            break;
            case 5:
            System.out.println("Fri");
            break;
            case 6:
            System.out.println("Sat");
            break;
            case 7:
            System.out.println("Sun");
            break;
            default:
                System.out.println("No idea. what days is");


        }
    }
}
