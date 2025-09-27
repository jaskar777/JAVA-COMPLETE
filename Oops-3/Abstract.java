//compulsory abstract class
//abstract method only dont have content

abstract class Vehicle {

    abstract void speed();

    void brand() {
        System.out.println("Brand");
    }
}

class Bike extends Vehicle {

        void speed() {
            System.out.println("100 km/hr");
        }

    }

class Car extends Vehicle {
    //must override the speed 
    @Override
    void speed() {
        System.out.println("abstract");
    }
}

public class Abstract {
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.speed();

        Bike b1 = new Bike();
        b1.speed();
        b1.brand();

    }
}
