package Other_program;

import java.util.Scanner;

public class break_with_continue {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input a integer");
        int in = sc.nextInt();

            if (in != 0) {
                System.out.println("you entred" + "in");
                continue;
            }
            else
            {
                break;
            }
        }
    }
}
