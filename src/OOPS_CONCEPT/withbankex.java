package OOPS_CONCEPT;

public class withbankex {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.name = "SBI";
                bank2.name = "ICICI";

                bank2.balance=1000;
                bank1.balance=3000;

        System.out.println(bank2.name);
        System.out.println(bank1.name);
        System.out.println(bank1.balance);
    }
}
