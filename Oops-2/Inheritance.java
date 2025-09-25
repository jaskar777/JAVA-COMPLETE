class Laptop {
    String name;
}

class Animal {
    String animal_name = "lion";
}
  
class Father {
    
    int money = 1000;
}
 
class Son extends Father{
    
}





public class Inheritance {
    public static void main(String[] args) {
        

        Laptop l1 = new Laptop();
        l1.name = "Hp";
        System.out.println(l1.name);
        
        Laptop l2 = new Laptop();
        l2.name="DEll";
        System.out.println(l2.name);


        Son s1 = new Son();
        System.out.println(s1.money);

        


































































































    }
}
