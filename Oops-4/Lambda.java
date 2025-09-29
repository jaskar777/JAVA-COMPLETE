interface A {
    void disp();
}


public class Lambda {
    
    public static void main(String[] args) {

        A obj = new A(){//inner class   
        public void disp(){
            System.out.println("This is display");
        }
        };
        obj.disp();

        A obj1 = () -> {
                System.out.println("New display");
        };
        obj1.disp();


    }
}
