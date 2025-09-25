class Animal {
    void eat() {
        System.out.println("Animal only aat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barks");
    }
}

public class Single {
    public static void main(String[] args){

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();

    }
}
