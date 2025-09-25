class A{
    String one = "one";
    
}

class B extends A {

    String two = "two";
}

class C extends B {

    String three = "three";
}


class Animal {
    void eat() {
        System.out.println("All animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("BArks");
    }
}

class Cat extends Dog {
    void sound() {
        System.out.println("meow");

    }
}
public class Multilevel {
    public static void main(String[] args) {
        

        C obj = new C();
        System.out.println(obj.three);
        System.out.println(obj.two);
        System.out.println(obj.one);


        Cat c1 = new Cat();
        c1.bark();
        c1.eat();
        c1.sound();
    }
}
