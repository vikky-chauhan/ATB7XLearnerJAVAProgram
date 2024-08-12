package Other_program;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner pass = new Scanner(System.in);
        System.out.println("Enter the student marks");
        int marks = pass.nextInt();
        int passnumber = 33;

        if (marks >= passnumber) {
            System.out.println("student is pass");
        }
        else {
            System.out.println("student is fails");
        }
    }
}
