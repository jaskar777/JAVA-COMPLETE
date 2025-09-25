class Animal {
    void eat() {
        System.out.println("All animal eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow");
    }
}



public class Heirarchical {
    public static void main(String[] args) {
        

        Cat obj = new Cat();
        obj.eat();
        obj.sound();
        //obj.bark(); error bcoz we can access two object
        System.out.println("-----");
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.eat();

    }
}
