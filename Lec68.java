//Enum --Enumeration

enum Status
{
    Running, Pending, Error, Failed, Success
}


public class Lec68 
{

    public static void main(String[] args) 
    {
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status v[] = Status.values();
        System.out.println(v[3]);
 
        for(Status ss : v)
        {
            System.out.println(ss + " : " + ss.ordinal());
        }

    }
    
}
