interface Printable {
    void display();
}

interface Showable {
    void display();

}

class C implements Printable,Showable {
   @Override 
   public void display() {
        System.out.println("Class c");
    }
}

public class Multiple{
    public static void main(String[] args) {
        
        C obj = new C();
        obj.display();

    }
}