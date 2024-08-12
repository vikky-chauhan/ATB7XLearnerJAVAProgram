package OOPS_CONCEPT.Laptop;

public class laptopwirhEx {

    public static void main(String[] args) {

        LaptopMain laptop1 = new LaptopMain();
        LaptopMain laptop2  = new LaptopMain();

        laptop1.name="DELL";
        laptop1.colour = "BLACK";
        laptop1.Model="i5";

        System.out.println(laptop1.name);
        System.out.println(laptop1.colour);
        System.out.println(laptop1.Model);


        laptop2.name = "HP";
        laptop2.colour = "RED";
        laptop2.Model="i7";


        System.out.println(laptop2.name);
        System.out.println(laptop2.colour);
        System.out.println(laptop2.Model);
    }
}
