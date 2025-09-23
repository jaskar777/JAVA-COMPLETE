public class Constructor {

    int marks;
    String name;

    Constructor() {
        
        System.out.println("Default constructor ");
    }

    
    public static void main(String[] args) {
        
        // int a;if print it will be error without initiate value 
        // a=10;
        // System.out.println(a);

        Constructor obj = new Constructor();
        System.out.println(obj.marks);//0
        System.out.println(obj.name);//null

        Constructor obj1 = new Constructor();
    }
}
