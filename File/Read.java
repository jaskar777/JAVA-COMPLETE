import java.io.BufferedReader;
import java.io.FileReader;
public class Read {
    public static void main(String[] args) {
        try {
            FileReader obj = new FileReader("Reads.txt");
            BufferedReader br = new BufferedReader(obj);

            // int c = obj.read();
            // // System.out.println(c);
            // System.out.print((char) c);
            // c = obj.read();
            // System.out.print((char) c);
            // obj.close();

            // while (c != -1) {
            //     System.out.print((char) c);
            //     c=obj.read();

            // }

            //now buffered reader direct come all value
            String line = br.readLine();
            // System.out.println(line);

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
