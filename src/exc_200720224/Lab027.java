package exc_200720224;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char Grade='F';

        if (score >= 90 && score <= 100) {
            Grade = 'A';
        }
        else if (score >= 80 && score <= 89) {
            Grade = 'B';
        } else if (score >=70 && score<=79) {
            Grade = 'C';
        } else if (score>=60 && score<=69) {
            Grade = 'D';
        } else if (score <= 0 || score > 100) {
            System.out.println("LOL, Are you God");
            Grade='0';
        } else {
            Grade='F';
        }
            System.out.println("Your Grade is ==>" +Grade);
            
            sc.close();
        }
    }