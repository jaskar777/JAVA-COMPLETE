public class Parameter {
    void soap(int money) {
        System.out.println("hamam" + money);
        System.out.println("soap purchesed");
    }
    
    void chocolate(String name){
        System.out.println("Chocolate purchesed");
        System.out.println(name + " choclate");
    }

    void sum(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        
    }

    public static void main(String[] args) {
        
        Parameter obh = new Parameter();
        obh.soap(20);
        obh.chocolate("diary milk");
        obh.sum(100, 200);

        
    }
}
