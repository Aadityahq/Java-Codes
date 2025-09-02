public class arr {

    public static void main(String[] args) {
        
        float arr[][] = new float[4][5];

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
            arr[i][j] = (float)Math.random() * 100;
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
