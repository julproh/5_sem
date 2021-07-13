class A{
    String name = "Class A";
    String getName() {
        return name;
    }
}

class B extends A {
    String name = "Class B"; // Так делать нельзя
    String getName() {
        return name;
    }
}

public class AB {
    public static void main(String[] args) {
        A a = new A();
        B b  = new B();
        A ab = new B();
        System.out.println("a :" + a.name + " " + a.getName());
        System.out.println("b :" + b.name + " " + b.getName());
        System.out.println("ab :" + ab.name + " " + ab.getName());
    }
}