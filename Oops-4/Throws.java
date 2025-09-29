class Calculator {
    void div() throws Exception {
        int a = 10 / 0;
    }
}

public class Throws {
    public static void main(String[]  args) {

        Calculator obj = new Calculator();
        try {
            obj.div();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
