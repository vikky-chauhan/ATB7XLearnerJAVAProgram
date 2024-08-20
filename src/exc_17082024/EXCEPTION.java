package exc_17082024;

import java.awt.event.MouseAdapter;

public class EXCEPTION {

    public static void main (String[] args) {

        String ip = args[0];

        // ArrayIndexOutOfBoundsException: it is coming exception  when noo put any Arguments
        int a = Integer.parseInt(ip);

        //.NumberFormatException = it is coming exception  when noo put any String instead of Any Arguments.
        int b = 1000/a;

        //ArithmeticException = it is coming exception  when noo put 0 in Arguments, because can not devide by 0.

        System.out.println(a);
        System.out.println(b);


    }
}
