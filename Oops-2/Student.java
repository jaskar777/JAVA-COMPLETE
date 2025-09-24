public class Student {

    int mark;
    String name;

    Student(int a, String b) {
        mark = a;
        name = b;

    }

    
    public static void main(String[] args) {
        
        Student obj = new Student(100, "jaskar");
        System.out.println(obj.mark);
        System.out.println(obj.name);


    }
}