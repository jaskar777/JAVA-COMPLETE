public class Challenge_2 {
    public static void main(String[] args) {
        
        //reverse the number
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        int a1 = 5;
        int b1 = 10;
        for (int j = a1; j <= b1; j++) {
            System.out.println(j);
        }

        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                System.out.println(k + " Even number");
            } else {
                System.out.println(k + " odd number");
            }
        }
        
        //count the odd number 
        int oddcount = 0;
        for (int u = 0; u <= 10; u++) {
            if (u % 2 == 0) {
                System.out.println(u + " Even number");
            } else {
                //int oddcount = 0;
                // oddcount++; declare varible in outside
                //oddcount = oddcount + 1;
                oddcount = oddcount + 1;//it also print 
                System.out.println(u + " Odd number");

            }

        }
        System.out.println("Oddcount:" + oddcount);
        

        for (int g = 1; g <= 100; g++) {
            if (g % 3 == 0 && g % 5 == 0) {
                System.out.println("Both divisible by 3 and 5: " + g);
            }
            else {
                System.out.println("not divisible by :"+g);
            }
        }
         

        //count evennumber 
        int evennumber = 0;
        for (int y = 1; y <= 10; y++) {
            if (y % 2 == 0) {
                System.out.println("Even number: " + y);
                evennumber++;
            } else {
                System.out.println("Odd number: " + y);
            }
        }
        System.out.println("Count even number: "+evennumber);
        }
        
    }