class Teacher {

    public String name = "jas";
    private String t_name = "praveen";

    void display() {
        System.out.println(t_name);
    }

}


//in java file only one -->  public class classname is used no another
public class Accessmodifier {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        System.out.println(t1.name);
        // System.out.println(t1.t_name); --> error 
        t1.display();//now it work 

        //public --> can be accessed from anywhere 
        //private --> can be accessed only inside the class
        
    }
}
