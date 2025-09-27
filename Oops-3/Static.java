class Student{
    //if static int mark=0
    int mark = 0;
    static String teacher = "praveen";


    static void disp() {
        System.out.println("Hello");
    }
}




public class Static {

    static int a = 100000;
    public static void main(String[] args){

        Student s1 = new Student();
        s1.mark = 45;
        System.out.println(s1.mark);
        Student s2 = new Student();

        s2.mark = 100;
        System.out.println(s2.mark);
        System.out.println(s1.mark);//now it is 100 

        s2.teacher = "daniel";

        System.out.println(s1.teacher);
        System.out.println(s2.teacher);
        System.out.println(s1.teacher);

        //now how to access the static 
        System.out.println(Student.teacher);

        //it is now in one class-->  disp();
        Student.disp();
       
        System.out.println(a);//without static error

        

        

    }
}
