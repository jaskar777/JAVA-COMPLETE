



public class Parametercons {

    int marks;
    String name;

    Parametercons(int a,String b) {

        System.out.println("Hello");
        System.out.println(a);
        System.out.println("Name: "+b);
    }
    
    Parametercons() {

        System.out.println("Hello-2");

         
    }

    
    public static void main(String[] args){

        Parametercons obj = new Parametercons(100,"jeniskar");

        Parametercons obj1 = new Parametercons();

        Parametercons obj2 = new Parametercons();
        obj2.marks = 32;
        obj2.name = "jaskar";
        System.out.println(obj2.marks);
        
        
    }
}
