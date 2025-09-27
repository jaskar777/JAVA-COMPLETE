class Animal {

    int price = 1200;
    Animal(String name, int age) {
        System.out.println("Animal constructor");
        System.out.println("Name : " + name);
        System.out.println("Age: " + age);
    }
    void makesound() {
        System.out.println("Animal make sound");
    }


}


//child is accessing the parent class
class Dog extends Animal {
    Dog() {
        super("monkey", 12);
        super.makesound();
        System.out.println("Dog constructor");
        System.out.println(super.price);
    }
    
    
}




//super keyword is child class is access to parent class
public class Super {
    
    public static void main(String[] args) {

        Dog d1 = new Dog();//both print constructor
        //if argument passed in any one constructor it show error 

        


    }
}
