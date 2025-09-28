final class A {
    final void disp() {
        System.out.println("Class A");
    }
}

// now class - A also final cannot be accessed by extends 
//if method is overritten by final cannot be accessed

 
// class B extends A {
//     // @Override
//     // void disp() {
//     //     System.out.println("class - B");
//     // } before final it work 

// }


public class Final {
    public static void main(String[] args) {
        
        int a = 10;
        a = 100;
        System.out.println(a);

        final int n = 20;//once u assigned cannot access final and const 
        //final keyword cannot be overritten
        //n = 900;
        System.out.println(n);

        B obj = new B();
        obj.disp();

    }
}
