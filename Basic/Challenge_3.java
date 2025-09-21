import java.util.Scanner;
public class Challenge_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        for(int i=1;i<=5;i++){
            System.out.println(i);
        }



        int size = sc.nextInt();
        int[] total = new int[size];
        //array start 0  and main import a<size not a<=size 
        for (int a = 0; a <= size-1 ; a++) {
            total[a] = sc.nextInt();
        }

    }
}
