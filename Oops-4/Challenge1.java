class InvalidException extends Exception {
    InvalidException(String msg) {
        super(msg);
    }
}

class Agevalid {
    void checkage(int age) {
        try {
            if (age < 0 || age > 150) {
                throw new InvalidException("voted not allowed");
            }
            else {
                System.out.println("Voted allowed");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Challenge1 {
    public static void main(String[] args) {
        

        Agevalid obj = new Agevalid();
        obj.checkage(1000);

    }
}
