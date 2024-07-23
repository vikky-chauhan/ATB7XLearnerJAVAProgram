package exc_200720224;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browsername");
        String browsername = sc.next().toString();
        browsername = browsername.toLowerCase();

        switch (browsername) {
            case "Firebox":
                System.out.println("Open the firebox");
                break;
            case "Google":
                System.out.println("Open the Google");
                break;
            case "Crome":
                System.out.println("Open the Crome");
                break;
            case "Laptop":
                System.out.println("Open the Laptop");
                break;
            case "Mobile":
                System.out.println("Open the Mobile");
                break;
            default:
                System.out.println("Nothing print");


        }
    }
}