class NotValidException extends Exception{

    public NotValidException(String s) {
        super(s);//go to parent class
    }
    
    
}

public class Custom {
    public static void main(String[] args){

        try {
            
            int age = 10;
            if (age < 18) {
                throw new NotValidException("created my own exception");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
