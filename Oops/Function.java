public class Function {
    static void greeting() {
        System.out.println("vanakam");
        //dummy();
        //now static to non - static we cannot access now dummy() --> error
        //if no static dummy() is work 
        Function ob = new Function();
        ob.dummy();
    }

    void dummy() {
        System.out.println("Im jummy");
    }

    public static void main(String[] args){

        Function obj = new Function();
        obj.greeting();
        obj.dummy();

        System.out.println("------");
        Function obj2 = new Function();
        obj2.greeting();

        System.out.println("-----");
        greeting();
    }
}
