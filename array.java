public class array {

    public static void main(String args[])
    {
        //object notation
        int []marks = new int[4];
        marks[0] = 23;
        marks[1] = 25;
        marks[2] = 54;
        marks[3] = 44;


        for(int i = 0; i < 4; i++)
        {
             System.out.println(marks[i]);
        }


        System.out.println("\n");

        //literal notation
        int num[] = {1,2,4,5,6};

        for(int i = 0; i < 5; i++)
        {
            System.out.println(num[i]);
        }


        // for(int i = 0; i < num.length; i++)
        // {
        // System.out.println(num[i]);
        // }
    }
    
}
