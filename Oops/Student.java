import java.util.Scanner;
public class Student {

    String passorfail(int score) {
        if (score < 35) {
            return "fail";
        }
        else {
            return "pass";
        }
    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        
        Student obj = new Student();
        System.out.println(obj.passorfail(mark));


    }
}
