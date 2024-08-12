package OOPS_CONCEPT;

public class Car {
String name = "LOL";
String colour = "RED";

void walk(){}
    void eat() {}

    public static void main(String[] args) {

    Car animalref1 = new Car();
    Car animalref2 = new Car();
    Car animalref3 = new Car();
    Car animalref4 = animalref3;
        System.out.println(animalref3.name);
        System.out.println(animalref3.colour);

        System.out.println(animalref2.name);

    }
}
