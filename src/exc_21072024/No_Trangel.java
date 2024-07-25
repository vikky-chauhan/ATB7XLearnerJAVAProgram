package exc_21072024;

import java.util.Scanner;

public class No_Trangel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
        //System.out.println("Enter the number of rows of floyd's triangle you want");

        int n = sc.nextInt();
        //int n = in.nextInt();

        System.out.println("Floyd's triangle :-");
        //System.out.println("Floyd's triangle :-");

        int num=1;
        // int num=1;

        for (int i=1; i<=n; i++) {
            // for ( int c = 1 ; c <= n ; c++ )       {
            for (int j=1; j<=i; j++){
                // for ( int d = 1 ; d <= c ; d++ )          {

                System.out.print(num + " ");
                // System.out.print(num + " ");
                num++;
                //num++;
            }
            System.out.println();
            // System.out.println();
        }
    }
}
