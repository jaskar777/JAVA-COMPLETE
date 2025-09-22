
import java.util.Scanner;
public class Challenge_1 {

    void evenorodd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        }
        else {
            System.out.println(num+ " is a odd number");
        }
    }
    public static void main(String[] args) {
        
          
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Challenge_1 obj = new Challenge_1();
        obj.evenorodd(number);

    }
}
