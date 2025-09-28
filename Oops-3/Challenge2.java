abstract class Vehicle {
    
    final void startengine() {
        System.out.println("ENgine started");
    }

    static String getvehicletype() {
        return "Generic vehicle";
    }

    abstract void drive();
}


class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving car");
    }

}

class Bike extends Vehicle {
     @Override
    void drive() {
        System.out.println("Driving bike");
    }
}
public class Challenge2 {
    public static void main(String[] args) {
        

        Car c1 = new Car();
        c1.drive();

        System.out.println(Vehicle.getvehicletype());
    }
}
