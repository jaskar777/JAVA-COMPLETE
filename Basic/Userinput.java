import java.lang.System;
import java.util.*;
public class Userinput {
    public static void main(String[] args){


        System.out.println("SYstem is already pre library in java");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        
        int a = sc.nextInt();
        //integer after string u must specify scanner nextline 
        sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Integer : " + a);
        System.out.println("Integer after String : " + b);

        //data type is a statically typed  language
         

    }
}  
