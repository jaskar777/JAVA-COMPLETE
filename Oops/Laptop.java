public class Laptop {
    String name = "";
    String processor = " ";
    int ram = 0;
    int price = 0;

    public static void main(String[] args) {
        
        Laptop lap1 = new Laptop();
        lap1.name = "mac";
        lap1.processor = "ryzen 5";
        lap1.ram = 128;
        lap1.price = 65000;
         
        Laptop lap2 = new Laptop();
        lap2.name = "samsung";
        lap2.processor = "ryzen 7";
        lap2.ram = 256;
        lap2.price = 95000;

        System.out.println(lap2.name);
        System.out.println(lap2.price);

        Laptop lap3 = new Laptop();
        System.out.println(lap3.price);// zero 0 initial value zero

    }
}
