class Count {
    static int count = 0;
    int instancenumber = 0;

    Count() {
        count = count + 1;
        instancenumber = instancenumber + 1;

    }

    void display() {
        System.out.println("static Count: "+count);
        System.out.println("Instance number: "+instancenumber);
    }

}

public class Counter {
    public static void main(String[] args){


        Count obj = new Count();
        obj.display();

        Count obj1 = new Count();
        obj.display();

        Count obj2 = new Count();
        obj2.display();  

    }
}
