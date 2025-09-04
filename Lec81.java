// Custom exception

class CustomException extends RuntimeException
{
    public CustomException(String exceptionMsg)
    {
        super(exceptionMsg);
    }
}

public class Lec81 {
    public static void main(String[] args) {
        
        int num = 28;
        int num2 = 4;
        int result = 0;
        int noOfTerms = 33;

        try
        {
            result = (num + num2 )/noOfTerms;
            if(noOfTerms >= 32)
                throw new CustomException("Cannot divide the sum of num and num2 by zero");

            System.out.println("Avg find");
            
        }
        catch(CustomException e)
        {
            result = (num + num2)/2;
            System.out.println("Can't divide  " + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");        
        }
        finally{
             System.out.println(result);
        }
    }
    
}
