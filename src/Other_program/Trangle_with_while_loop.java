package Other_program;

public class Trangle_with_while_loop {
    public static void main(String[] args) {

     int i = 1;
     int st=5;
     while (i<=st) {
         int j=1;
         while (j <= i) {
             System.out.print("*");
             j++;
         }
         System.out.println();
         i++;
     }

    }
}
