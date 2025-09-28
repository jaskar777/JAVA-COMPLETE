abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }
    abstract void makesound();

}

class Dog extends Animal {

    Dog() {
        super("german");
    }
    void makesound() {
        System.out.println("barks");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    void makesound() {
        System.out.println("meow");
    }
}

public class Abstractclass {

    public static void main(String[] args) {
        

        Dog d1 = new Dog();
        d1.makesound();

        Cat c1 = new Cat("tommy"); 
        c1.makesound();

    }
    
}
