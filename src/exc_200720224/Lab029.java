package exc_200720224;

import java.util.Scanner;

public class Lab029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code as per shop");
        int itemcode = sc.nextInt();
//int itemcode = 7;

switch (itemcode) {

    case 001,002,003:
        System.out.println("This is electronic shop");
        break;
    case 004,005,006:
            System.out.println("This is machanic shop");
            break;
    default:
        System.out.println("Nothing Any shop");
}
    }
}
