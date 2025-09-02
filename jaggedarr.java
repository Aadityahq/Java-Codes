public class jaggedarr {
    public static void main(String[] args)
    {
        int arr[][] = new int[6][];

        arr[0] = new int[4];
        arr[1] = new int[6];
        arr[2] = new int[2];
        arr[3] = new int[6];
        arr[4] = new int[2];
        arr[5] = new int[9];

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr.length + " ");
        //     System.out.println();

        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //         arr[i][j] = (int)(Math.random() * 100);
        //         System.out.println(arr[i].length);
        //     }
        // }


        for(int x[]: arr)
        {
            for(int y: x)
            {
                y = (int)(Math.random() * 10);
                System.out.print(y + " ");

            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = (int)(Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
