public class multid_array {

    public static void main(String[] args) {
        int arr[][] = new int[4][6];
      
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j] = (int)(Math.random() * 10);
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }


        //enhanced for loop
        for (int x[]: arr)
        {
            for(int y: x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
    }
    
}
