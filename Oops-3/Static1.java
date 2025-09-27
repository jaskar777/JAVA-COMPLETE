public class Static1 {
    

    static int a = 100;

    static {
        System.out.println("hey there");
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(a);

        Static1 s1 = new Static1();
        Static1 s2 = new Static1();


        //static is for performance of code

    }
}
