class A extends Thread {
    int j = 0;

    public void run() {
        for (int i = 0; i < 50; i++) {
            j = i;
        }
    }
}


public class Join {
    
    public static void main(String[] args){

        A a1 = new A();
        a1.start();
        try{
            a1.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a1.j);

    }
}
