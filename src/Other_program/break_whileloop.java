package Other_program;

public class break_whileloop {
    public static void main(String[] args) {

        int i=1;
        while (i <= 10) {
            System.out.println(i);
           i++;
           if (i==4){
               System.out.println("FIVE");
               break;
           }
        }
    }
}
