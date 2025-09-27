class Person {
    String name;

    Person(String fullname) {
        this.name = fullname;
    }
}

class Employee extends Person {

     Employee(String name) {
         super(name);
        System.out.println(super.name);
    }
    
}



public class Super1 {
    public static void main(String[] args) {
        
        // Person p1 = new Person("John");

        Employee e1 = new Employee("jaskar");

    }
}
