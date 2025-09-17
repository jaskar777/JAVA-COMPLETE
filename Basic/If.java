public class If {
    public static void main(String[] args) {
        
        if (true) {
            System.out.println("true value: ");
        }
        else {
            System.out.println("False value");
        }

        System.out.println(23 > 22);
        System.out.println(3 > 5);
        
        int num1 = 40;
        int num2 = 69;
        System.out.println(num1 > num2);
        System.out.println(num2 > num1);

        if (num1 > num2) {
            System.out.println("It num1 greater");
        }
        else {
            System.out.println("num2 is greater  ");
        }
        
        if (1 == 2) {
            System.out.println("It egual");
        }
        else {
            System.out.println("It now equal");
        }

        System.out.println(23 != 23);
        System.out.println(23!=2);//true
    
    } 
}  
