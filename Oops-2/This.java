public class This {

    String name;

    This() {
        System.out.println("Hello");
    }

    void display(String myname) {
        System.out.println("display ");
        this.name = myname;//top of the name access in this parameter
        //if paramter is String myname
        //myname=myname in output is null
    }

    public static void main(String[] args) {
        

        This obj = new This();
        obj.display("jaskar");
        System.out.println(obj.myname);
        


    }
}
