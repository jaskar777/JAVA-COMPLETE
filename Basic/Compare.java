import java.util.*;
public class Compare {
    public static void main(String[] args){

        int mark = 20;
        if((mark > 12) && (mark>11) ){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }
        
        
        boolean hungry = true;
        boolean icecream=true;
        if (hungry && icecream) {
        		System.out.println("Now eat");
        }
        else {
        	System.out.println("Not eat");
        }
        
        
        if(true || false) {
        		System.out.println("It is now true");
        }
        else {
        		System.out.println("It false");
        }
        
        if(false && false) {
        	System.out.println(false);
        }
        else {
        	System.out.println(true);
        }
         
        
        if(false || false) {
        	System.out.println(true);
        	
        }
        else {
        	System.out.println(false);
        }
        
        System.out.println(15%5 );
        
        int num=15;
        System.out.println(num%2);
        
       //6 and 3 is deivisible by any number 
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter number: ");
        int n=sc.nextInt();
        if(n%3==0 && n%6==0) {
        	System.out.println("It is divisble by 3 and 6");
        }
        else {
        	System.out.println("it is not divisible");
        }
        
        
         
    }
}
