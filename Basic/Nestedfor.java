public class Nestedfor {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        for (int a = 1; a <= 1 ; a++) {//based on first condition to work
            for (int b = 1; b <= 3; b++) {
                System.out.println("jas");
            }//first this finished next go outside the loop to 
        }


         //teacher 1, 2, 3 
         for (int teacher = 1; teacher <= 3; teacher++) {//first for loop base condition 
             for (int t = 1; t <= 5; t++) {
                 System.out.println("teacher-" + t);
             }
         }
         

         for (int o = 1; o <=3; o++) {
             for (int p = 1; p <= 3; p++) {
                 System.out.print("*");
             }
            System.out.println();
         }

    }
}
