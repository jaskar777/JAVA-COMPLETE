import java.io.BufferedWriter;
import java.io.FileWriter;

public class Buffer {
    public static void main(String[] args) {
        
        try {
            FileWriter f1 = new FileWriter("Buffer.txt", true);

            BufferedWriter bw = new BufferedWriter(f1);

            bw.write("Hello ");
            bw.newLine();
            bw.write("Everybody");
            bw.close();
            System.out.println("Success");

        } 
        catch (Exception e) {

            System.out.println(e + "something happened");
        }

    }
}
