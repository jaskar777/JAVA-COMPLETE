public class Foreach {
    public static void main(String[] args) {
        
        int[] marks = { 1, 10, 203, 23, 2, 34, 200 };
        

        //array start with zero and less than only give <= --> out of bond exceptation 
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
        for (int a : marks) {
            System.out.println(a);
        }

        String[] b = { "apple", "mango", "banana" };
        for (String c : b) {
            System.out.println(c);
        }

        System.out.println(7 / 2);//2if integer value divided integer out put integer value
        System.out.println(7.0 / 2);//3.5 if decimal value divided by integer value output is decimal value 
        
        System.out.println(7/2.0);//3.5


    }
}
