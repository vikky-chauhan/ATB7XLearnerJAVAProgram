package exc_200720224;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vovels");
        char user_input = sc.next().charAt(0);
         switch (user_input) {
             case 'A':
                 System.out.println("Vovels");
                 break;
             case 'E':
                 System.out.println("Vovels");
                 break;
             case 'I':
                 System.out.println("Vovels");
                 break;
             case 'O':
                 System.out.println("Vovels");
                 break;
             case 'U':
                 System.out.println("Vovels");
                 break;
             default:
                 System.out.println("Nothing any Vovels");
         }
    }
}
