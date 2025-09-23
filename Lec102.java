sealed class A permits B, C {
    public void show() {
        System.out.println("in void A");
    }
}

final class B extends A {
  
    public void show() {
        System.out.println("in void B");
    }
}

non-sealed class C extends A {
    
    public void show() {
        System.out.println("in void C");
    }
}

public class Lec102 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        B obj1 = new B();
        obj1.show();

        C obj2 = new C();
        obj2.show();
    }
}
