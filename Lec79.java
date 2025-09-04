// Exception throw keyword


public class Lec79 {
    public static void main(String[] args) {

        int a = 89;
        int b = 0;
        int result = a/b;

      
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
            
        }
        
       
            
        System.out.println(result);
        
    }
    
}
