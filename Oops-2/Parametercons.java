

public class Parametercons {

    int marks;
    String name;

    Parametercons(int a) {

        System.out.println("Hello");
        System.out.println(a);
    }
    
    Parametercons() {

        System.out.println("Hello-2");
        
    }

    
    public static void main(String[] args){

        Parametercons obj = new Parametercons(100);

        Parametercons obj1 = new Parametercons();
        
        
    }
}
