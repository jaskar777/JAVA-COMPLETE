import java.io.FileWriter;

public class Sample {
    public static void main(String[] args) {
        
        try{
        FileWriter f1 = new FileWriter("Output.txt",true);
        //f1.write("hello world,Everyone");
        //add next text
        f1.append("Everyone how are you! ");
        f1.close();
        System.out.println("success");

        }
        catch (Exception e) {
            System.out.println("Something happend");
        }
    }
}
