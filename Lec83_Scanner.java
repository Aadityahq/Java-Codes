//Taking input using Scanner Class

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lec83_Scanner {

    public static void main(String args[]) throws FileNotFoundException
    {
        // -- Input through scanner class
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number : ");
        // int num = scanner.nextInt();

        // scanner.close();

        // System.out.println("Entered number is : " + num);



        // --- Input through String

        // String str = "Aditya";
        // Scanner sc = new Scanner(str);
        // String name = sc.nextLine();
        // sc.close();
        // System.out.println(name);

        // -- Input through file

        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) 
        {
            String inputLine = sc.nextLine();
            System.out.println(inputLine);
        }
        sc.close(); //resource closed
    }
    
}
