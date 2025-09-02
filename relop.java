public class relop {

    public static void main(String[] args) {
        
        int a = 4;
        int b = 4;

        boolean result = a == b;
        System.out.println(result);
        System.out.println(!result);


        int x = 3;
        int y = 9;

        // boolean result1 = x < y;
        // System.out.println(result1);

        // boolean result2 = x != y;
        // System.out.println(result2);

        boolean result3 = a > b & x > y;
        System.out.println(result3);


    }
    
}
