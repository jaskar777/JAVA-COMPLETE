class Animal {
    String name;
    int age;

    void makesound() {
        System.out.println("Animal make sound");
    }
}


class Dog extends Animal {

    String breed;

    @Override //optional if not use it will run
    void makesound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }

}

class Cat extends Animal {
    String color;

    @Override
    void makesound() {
        System.out.println("cat meow");
    }

    void climb() {
        System.out.println("cat climb");
    }
}
public class Challenge_1 {
    public static void main(String[] args) {
        
        // Animal obj = new Animal();
        // obj.name = "lion";
        // obj.age = 10;
        // obj.makesound();
        // System.out.println(obj.name);

        Dog d1 = new Dog();
        d1.name = "tiger";
        d1.age = 2;
        d1.breed = "labrador";
        System.out.println(d1.name);
        d1.makesound();
        d1.fetch();

        //another object 

        Cat c1 = new Cat();
        c1.age = 10;
        c1.name = "orange cat";
        c1.color = "orange";
        c1.makesound();
        c1.climb();

    }
}
