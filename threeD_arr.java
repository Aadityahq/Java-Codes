public class threeD_arr{

    public static void main(String[] args)
    {
        
        int arr[][][] = new int[2][4][6]; // 3-Dimension Array

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                for(int k = 0; k < 6; k++)
                {
                    arr[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



        System.out.println();
        //by using enhanced for loop

        for(int x[][]: arr)
        {
            for(int y[]: x)
            {
                for(int z: y)
                {
                    z = (int)(Math.random() * 10);
                    System.out.print(z + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
