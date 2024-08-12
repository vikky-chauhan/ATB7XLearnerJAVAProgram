package Other_program;

import java.util.Scanner;

public class factor_no1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int fact = 1;
        int i,c ;

        if (n < 0) {
            System.out.println("negative print");
        }
        else {

            for (c = 1; c<=n; c++) {
                fact = fact * c;
                System.out.println("factor " + fact);
            }
        }
    }
}

