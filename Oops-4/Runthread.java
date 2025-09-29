import java.lang.Runnable;

class A implements Runnable {
    public void run(){
        System.out.println("Hello");
    }
}

public class Runthread {
    public static void main(String[] args) {
        
        
        A obj = new A();

        //thread why we use means thread have start method

        Thread t1 = new Thread(obj);
        t1.start();

    }
}
