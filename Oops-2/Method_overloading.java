public class Method_overloading {


    void display() {
        System.out.println("Hello world ");
    }

    //function name is ok but paramter is must be different
    void display(int a){
        System.out.println("hell-2");
    }

    void display(int i, int j) {
        System.out.println("Hello-3-- total: "+(i+j));
    }
    public static void main(String[] args){

        Method_overloading obj = new Method_overloading();
        obj.display();
        obj.display(2);
        obj.display(100,200);

    }
}
