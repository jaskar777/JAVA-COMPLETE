public class Throwerror {
    public static void main(String[] args) {
        
        try {
            int a = 10 / 2;
            //if you want to error u can create error
            throw new ArithmeticException("Hello");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("FInal");


        try{
            int age=20;
            if (age > 18) {
                throw new ArithmeticException("AGe greater than 18");
            }
            else {
                System.out.println("Age is valid: "+age);
            }

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
