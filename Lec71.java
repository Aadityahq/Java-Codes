//Annotation


@FunctionalInterface 
interface X 
{
    void show();
}

@Deprecated // annotation
class A implements X
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{

    @Override  //annotation 
    public void show() {
        
        System.out.println("In B show");
        
    }

   
}
public class Lec71 
{
    public static void main(String[] args) 
    {
        A obj = new B();

        obj.show();
    }
}
