package OOPS_CONCEPT;

public class Basic {
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 23;
        p1.name = "vikas";

        person p2 = new person();
        p2.age = 21;
        p2.name= "vikky";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
p1.eat();
p2.walk();
    }
}



class person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

