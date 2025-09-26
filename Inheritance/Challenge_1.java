class Animal {
    String name;
    int age;

    void makesound() {
        System.out.println("Animal make sound");
    }
}


public class Challenge_1 {
    public static void main(String[] args) {
        
        Animal obj = new Animal();
        obj.name = "lion";
        obj.age = 10;
        obj.makesound();
        System.out.println(obj.name);

    }
}
