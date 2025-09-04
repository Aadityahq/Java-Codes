// Lambda Expression

@FunctionalInterface
interface BroCode
{
    void bhaiwood();
}

public class Lec74 
{
    public static void main(String[] args) {
        
    
    BroCode bro = () ->
        {
            System.out.println("Bro helps bro");
        };
        
    BroCode bro2 = () -> System.out.println("Bro helps bhai");
      

    bro.bhaiwood();
    bro2.bhaiwood();

    
    }
}
