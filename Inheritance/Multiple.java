interface Animal {

    int mark = 20;

    void sound();
    //interface don't have body


    //to create body 
    default void display() {
        System.out.println("DIsplay");

    }
    
    //static alos work 
    static void makesound() {
        System.out.println("Makesound");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}


public class Multiple {
    public static void main(String[] args) {
        
        //Animal obj = new Animal();
        //interface cannot create object 


        Cat c1 = new Cat();
        c1.sound();
        System.out.println(c1.mark);
        c1.display();
        Animal.makesound();


    }
}
