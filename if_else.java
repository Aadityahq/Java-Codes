public class if_else {

    public static void main(String args[])
    {
        int x = 45;
        int y = 67;
        int a = 39;
        int b = 89;

        if(x > y || a < b){
            System.out.println(x);
        }    
        else {    
            System.out.println(y); 
        }

        if(x>y && x>a)
            System.out.println(x);
        else if(y>a) 
            System.out.println(y);
        else
            System.out.println(a);
        
    }
    
}
