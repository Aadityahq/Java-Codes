//Exception in java

public class Lec76
{
    public static void main(String[] args) 
    {
        int age = 80; // Normal Statement
        int ageFactor = 0;
        int arr[] = { 2, 5, 6, 8, 3};
        int factorNumber = 0;

        try{
            ageFactor = age/factorNumber;  //critical statement
            System.out.println(arr[8]);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong...");
        }
        finally 
        {
            System.out.println("Other statements will run");
        }
        
        System.out.println(ageFactor);
        System.out.println("Bye");
        
    }
}