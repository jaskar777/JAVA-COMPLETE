
import java.util.Random;
public class While {

    public static void main(String[] args){
        //if for loop we know start and ending point 
        // if while loop we know starting point but no ending point 

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j ++;
        }

        //while loop it how many times run to get the value 5 
        Random rand = new Random();
        int newnum = rand.nextInt(10);//0 to 9
        System.out.println("Random: number: " + newnum);
        


        int n = 0;
        while (n !  = 5) {
            n = rand.nextInt(11);
            System.out.println("Number: "+n);
        }
    }
}
