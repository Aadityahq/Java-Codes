import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lec84 {
    public static void main(String[] args) throws IOException{
        

        // --- Old Method to close resources using finally block
        // BufferedReader br = null;
        // try{
        //     System.out.println("Enter input");
        //     InputStreamReader input = new InputStreamReader(System.in);
        //     br = new BufferedReader(input);
        //     String inputResult = br.readLine();
        //     System.out.println(inputResult);
        // }
        // finally
        // {
        //     br.close();
        // }

        // -- try block with resources
        // String name = " ";
        // try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        // {
        //     System.out.println("Enter a name ");
        //     name = br.readLine();
        //     System.out.println("Hello " + name + " ! ");            
        // }

        try (Scanner sc = new Scanner(System.in);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int age;
            System.out.println("Enter your age");
            age = sc.nextInt();

            System.out.println("Enter your name ");
            String name = br.readLine();

            System.out.println("My name is " + name  + " and my age is " + age);

            // br.close();  --- this is the order of closing the resources automatically 
            // sc.close();


        }



    }
    
}
