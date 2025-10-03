public class Split {
    public static void main(String[] args) {
        
        String name = "I am a programmer in java and python";

        String program[] = name.split(" ");

        for (String a : program) {
            System.out.println(a + " - " + a.length());
        }
        System.out.println(name+" - "+name.length());
    }
}
