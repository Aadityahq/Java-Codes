//try statement with multiple catches


public class Lec78 
{
    public static void main(String[] args) 
    {
          int age = 80; // Normal Statement
        int ageFactor = 0;
        int arr[] = { 2, 5, 6, 8, 3};
        int factorNumber = 4;
        String str = null;

        try{
             //critical statement
            ageFactor = age/factorNumber; 
            System.out.println(arr[2]);
            System.out.println(arr[8]);

            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("something went wrong..." + e);
            System.out.println();
           
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound - " + e);
        }
        catch(Exception e)
        {
            System.out.println("There is an exception in the code");
        }
        finally 
        {
            System.out.println("Other statements will run");
        }
    }
}
