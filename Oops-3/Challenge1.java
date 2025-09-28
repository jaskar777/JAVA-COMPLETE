class Person {
    public String name;
    protected int age;
    private String accountnumber;
    String address;

    Person(String nam,int a,String account,String addr) {
        this.name=nam;
        this.age=a;
        this.accountnumber=account;
        this.address=addr;
    }
}


class Employee extends Person {

    Employee(String name, int age,String accountnumber,String address) {
        super(name,age,accountnumber,address);
        System.out.println("Hello everyone ");
    }
    
    
}


public class Challenge1 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("john", 22, "2323abc", "madurai");
        System.out.println(e1.name);
        System.out.println(e1.age);
       //   System.out.println(e1.accountnumber);
        System.out.println(e1.address);

    }
}
