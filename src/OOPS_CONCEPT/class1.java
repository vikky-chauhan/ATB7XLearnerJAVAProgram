package OOPS_CONCEPT;

public class class1 {
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 23;
        p1.name = "Vamika";

        person p2 = new person();
        p2.name = "sommi";
        System.out.println(p1.name + " " + p1.age) ;
        System.out.println(p2.name + " " + p2.age) ;
        p1.walk();
        p2.eat();
        //p1.walk(2);


        class person {
            String name;
            int age;

            void walk() {
                System.out.println(name + " " + " is waking");
            }
                void eat() {
                    System.out.println(name + " " + "is eating");
            }
            void walk(int steps) {
                System.out.println(name + "walked" + steps);
            }
        }
    }
}
