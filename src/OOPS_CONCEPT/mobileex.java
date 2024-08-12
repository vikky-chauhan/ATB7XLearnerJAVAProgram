package OOPS_CONCEPT;

public class mobileex {
    public static void main(String[] args) {

        Samsung samsung1 = new Samsung();

        samsung1.MobileName = "samsung";
        samsung1.MobileColour="Black";
        samsung1.MobileModel="s24 ultra";
        System.out.println(samsung1.MobileName);
        System.out.println(samsung1.MobileColour);
        System.out.println(samsung1.MobileModel);

        Samsung mobile1 = new Samsung();

        mobile1.MobileName = "Moto";
        mobile1.MobileColour="Red";
        mobile1.MobileModel="G34";

        System.out.println(mobile1.MobileName);
        System.out.println(mobile1.MobileColour);
        System.out.println(mobile1.MobileModel);
        Samsung mobile2 = new Samsung();

        mobile2.MobileName="VIVO";
        mobile2.MobileColour="PINK";
        mobile2.MobileModel="V34";

        System.out.println(mobile2.MobileName);
        System.out.println(mobile2.MobileColour);
        System.out.println(mobile2.MobileModel);

    }
}
