//record class

// class A
// {
//     private final int id;
//     private final String name;

//     public A(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
    
  
//     public int getId() {
//         return id;
//     }


    
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }


//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         A other = (A) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }


//     public String getName() {
//         return name;
//     }


//     public String toString() {
//         return "A [id=" + id + ", name=" + name + ", toString()=" + super.toString() + "]";
//     }
    
// }
// This class implementation be written in one line using record class

record A (int id, String name){

    static int age ;

    // int age ; // error

    public A()
    {
        this(1, "Ado");
    }

    public A
    {
        if(id == 0)
            throw new IllegalArgumentException("Id can't be 0");
       
    }
}


public class Lec103 {

    public static void main(String[] args) {

        A obj = new A(2, "Adi");
        A obj1 = new A(2, "Aditya");

        System.out.println(obj);
        System.out.println(obj1.id());
        System.out.println(obj1.equals(obj1))12
    }
    
}
