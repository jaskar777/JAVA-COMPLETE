public class Pattern {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {// in i =1,2,3
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("for loop -----");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
