public class Strings {
    public static void main(String[] args) {
        
        String a1 = "apple";
        String a2 = "apple";//String pool 
        System.out.println(a1 == a2);
        
        String b1 = new String("apple");
        String b2 = new String("apple");// it will check reference
        System.out.println(b1 == b2);//here false 
        System.out.println(b1.equals(b2)); //now true

        System.out.println(a1.equals(a2));


        String a = "one";
        String b = "one";
        String c = b;
        System.out.println(a == c);//true
        

        String rcb = "win";
        if (rcb.equals("win")) {
            System.out.println("Rcb win");
        }
        else {
            System.out.println("Rcb not win ");
        }
    }
}
