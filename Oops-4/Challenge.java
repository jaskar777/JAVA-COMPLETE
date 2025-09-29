class Division {
    void divnumber(int num, int den) {
        try{
            int result = num / den;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divided: "+e);
        }
    }
}


public class Challenge {
    public static void main(String[] args) {
        
        Division obj = new Division();
        obj.divnumber(10, 2);

        Division obj1 = new Division();
        obj1.divnumber(10, 0);
        
    }
}
