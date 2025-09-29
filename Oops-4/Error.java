public class Error {
    public static void main(String[] args) {
        

        try{
            int a = 10/0;
            System.out.println(a);

        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("over");
        }

        try{
            int c[]={1,2,3,4};
            System.out.println(c[10]);
            int b = 10 / 0;
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        

        int a1 = 10;
        int b1 = 0;
        try {
            int c1 = a1 / b1;
            System.out.println(c1);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Final message");
        }
        //finally is if file open or close it must usefulll

    }
}
