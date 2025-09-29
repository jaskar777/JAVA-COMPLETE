class A extends Thread {//if extends thread now it thread
    public void run() { //run method is must 
        System.out.println("Hey hello");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HEllo " + i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        

        A obj = new A();
        obj.start();

        C obj2 = new C();
        obj2.start();


        B obj1 = new B();
        //first priority is B obj
        obj1.setPriority(1);
        obj1.start();

        
    }
}
