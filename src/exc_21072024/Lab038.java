package exc_21072024;

public class Lab038 {

    public static void main(String[] args) {

        // Make a trangle for 5  line

    int row = 5;  //number of the row of the trangle

        for (int i=1; i <= row; i++) {      //loop for each row
            for (int j=1; j <= i; j++ ) {   // loop for each column in a row
                System.out.print("*");      // print the asterisk

            }
            System.out.println();           // move to the next line after each row
        }

    }
}

