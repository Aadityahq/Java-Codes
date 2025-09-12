//Taking input using System.in.read

import java.io.IOException;

public class Lec83SystemInRead {

    public static void main(String args[]) throws IOException
    {
        // int num = 0;
        // System.out.println("Enter a number");
        // try{
        //     num = System.in.read();
        //     System.out.println((char)(num));
        // }
        // catch(IOException e)
        // {
        //     System.out.println("Enter a single digit" + e.getMessage());
        // }
        //   System.out.println(num);

        System.out.println("Enter a number");
        int num = System.in.read();

        System.out.println((char)num);
        

    }


}