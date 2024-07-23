package exc_200720224;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any vovels");
        String vovels = sc.next().toString();

        switch (vovels) {

            case "a", "e", "i", "o", "u":
            System.out.println("vovels");
            break;
            default:
                System.out.println("Notjing");
        }
    }
}
