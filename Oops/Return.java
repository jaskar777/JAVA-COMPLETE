public class Return {

    // if used void cannot use return keyword
    //void soap() --> cannot use void while using return keyword
    int soap(int money) {
        int soap_price = 18;
        int remainder = 20 - 18;
        return remainder;
    }

    int sum(int a, int b) {
        return a + b;
    }
    
    /*void greeting(String i, String j) {
        return i + " Hello" + j;
    }*/ // it will show error
    String greeting(String i, String j) {
        return i + " Hello" + j;
    }
    //if return value must parameter
    String getname() {

        return "jaskar";

    }
    
      
    public static void main(String[] args) {
        

        Return obj = new Return();
        int result = obj.soap(20);
        System.out.println(result);
       
        System.out.println(obj.sum(100, 200));
        
        System.out.println(obj.greeting("jas", "welcome"));

        String get_name = obj.getname();
        System.out.println(get_name);
    }
}
