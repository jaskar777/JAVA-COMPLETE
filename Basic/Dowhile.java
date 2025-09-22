import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        

        //do while if condition is true or false based on condition work
        do { 
            System.out.println("jas");//one time jas
        } while (false);

        int count =1;
        do{
            System.out.println("john");
            count++;
        } while (count <= 2);
        

        Scanner sc = new Scanner(System.in);
        int c = 0;
        do{
            System.out.println("Enter number > 10: ");
            c=sc.nextInt();

        } while (c < 10);// if enter 12 it will be break;
    }
}
