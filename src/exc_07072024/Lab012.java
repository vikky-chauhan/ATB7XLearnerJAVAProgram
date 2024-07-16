package exc_07072024;

public class Lab012 {

    public static void main(String[] args) {

        int a=10;
        int b=10;

        System.out.println(a >= b);  // 10>=10 means = 10 > 10 or 10 = 10 so output is True
        System.out.println(a <= b);  // 10<=10 means = 10 > 10 or 10 = 10 so output is True
        System.out.println(a == b);  // 10==10 means = 10 = 10 or 10 = 10 so output is True
        System.out.println(a > b);   // 10>10 means = 10 > 10  so output is False
        System.out.println(a > b);   // 10>10 means = 10 < 10  so output is False
    }
}
