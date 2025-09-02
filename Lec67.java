//more concept of interface



// class -> class -- extends keyword
// class -> interface -- implements keyword
// interface -> interface -- extends

interface StudentX
{
    int marks = 89;
    String address = "Purnea";

    void study();
    void show();
}


interface StudentY  // interface studentY can inherit all class of interface studentx
{
    void learn();
}

interface StudentZ extends StudentY // interface studentY can inherit all class of interface studentx
{

}

class Student implements StudentX,StudentZ
{
    public void study()
    {
        System.out.println("Student Studies");
    }

    public void show()
    {
        System.out.println("In show method");
    }

    public void learn()
    {
        System.out.println("Student learn");
    }
}


public class Lec67 
{
    public static void main(String[] args) 
    {
        // Student stud1 = new Student();
        // stud1.learn();
        // stud1.study();
        // stud1.show(); // all method execute
        
        StudentX obj;
        obj = new Student();
        obj.study(); // only interface x method

        StudentY obj1 = new Student();
        obj1.learn();

        System.out.println(StudentX.marks + " : " + StudentX.address);  



        
        

        
    }
}
