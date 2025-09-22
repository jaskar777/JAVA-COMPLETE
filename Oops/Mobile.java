public class Mobile {


    void iphone() {
        System.out.println("Iphone -17 ");
    }

    void oppo(){
        System.out.println("oppo phone");
    }

    void samsung() {
        System.out.println("Samsung -25");
    }

    void vivo() {
        System.out.println("vivo-phone");
        oppo();
    }

    int a = 10;
    int b = 20;

    void sum() {
        System.out.println("Total: " + (a + b));
    }
    
    int apple_price = 20;
    int apple_count = 2;

    void total_money() {
        System.out.println("Total price: "+(apple_price*apple_count));
    }
    public static void main(String[] args){

        Mobile obj = new Mobile();
        obj.iphone();
        obj.samsung();
        obj.vivo();
        obj.sum();
        obj.total_money();
        System.out.println(obj.apple_count);

    }
}
