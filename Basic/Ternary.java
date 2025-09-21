public class Ternary {
    public static void main(String[] args) {
        
        int age = 18;
        System.out.println((age >= 18) ? "vote" : "not vote");
        
        System.out.println(false ? "yes" : "no");
        
        String result = true ? "yes" : "no";
        System.out.println(result);

        int res = (5>2)? 1111 : 0000;
        System.out.println(res);

        boolean rain=true;
        String result1 = rain ? "Take an umbrella " : "not take umbrella";
        System.out.println(result1);
    }
}
