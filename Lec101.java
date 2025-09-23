//var variable

public class Lec101 {

    //var c = 6; // gives error 
    public static void main(String[] args) {
        var a = 3;
        System.out.println(a);

        String var = "Aditya";
        System.out.println(var);

        var num = new int[4];
        num[0] = 1;
        num[1] = 14;
        num[2] = 16;
        num[3] = 18;
        for(int n : num)
        {
            System.out.println(n);
        }
        
    }
    
}
