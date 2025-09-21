import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        String one = "song1";
        String two = "song2";
        String three = "song3";

        //array starting position 0 

        //0 , 1 , 2
        String[] playlist = new String[3];
        playlist[1] = "song1";
        System.out.println(playlist[1]);

        playlist[2] = "song2";
        System.out.println(playlist[2]);

        // playlist[3] = "song3";
        // System.out.println(playlist[3]);
        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println(playlist[0]);//null


        String[] food = { "chicken", "biriyani", "kushka" };
        System.out.println(food[0]);


        int[] store = new int[5];

        Scanner sc = new Scanner(System.in);


        store[0] = sc.nextInt();
        store[1] = sc.nextInt();
        store[2] = sc.nextInt();
        store[3] = sc.nextInt();
        store[4] = sc.nextInt();

        System.out.println(store[0]+store[1]+store[2]);



    }
}
