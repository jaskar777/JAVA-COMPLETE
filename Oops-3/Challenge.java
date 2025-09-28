class Person {
    public String name;
    protected int age;
    private String socialsecuritynumber;
    String address;

    // Person(String nam) {
    //     this.name = nam;

    // }

    Person(String name) {
        System.out.println("Hello person: "+name);
    }
    
}

class Employee extends Person {
    
    
    Employee() {
        super("jas");
        System.out.println("Helloe employee");
    }

}

public class Challenge {
    public static void main(String[] args) {
        

        // Person p1 = new Person("John");

        // System.out.println(p1.name);

        Employee e1 = new Employee();



    }
}
