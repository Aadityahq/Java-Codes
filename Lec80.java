// throw keyword in exception

public class Lec80 {
    public static void main(String[] args) {
        
        int num = 28;
        int num2 = 4;
        int avg = 0;
        int noOfTerms = 0;

        try
        {
            avg = (num + num2 )/noOfTerms;
            if(noOfTerms == 0)
                throw new ArithmeticException();

            System.out.println("Avg find");

            
        }
        catch(ArithmeticException e)
        {
            avg = (num + num2)/2;
            System.out.println("Default setting divided by 2 " + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong...");
        }
        finally{
             System.out.println(avg);
        }
    }
    
}
