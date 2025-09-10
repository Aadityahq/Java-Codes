// User input using BufferReader Class using InputStream class 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec83_BufferReader {

    public static void main(String[] args) {
        
        InputStreamReader input = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(input);

        String num = " ";
        System.out.println("Enter a value");
        try{
            num = br.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Enter a valid value ");
            System.out.println(e.getMessage());
        }

        System.out.println("This is the input : " + num);

    }
}