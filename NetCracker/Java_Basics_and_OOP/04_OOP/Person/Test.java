abstract class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    abstract public void sayHello();
    
    public void doHandshake (Person p) {
        // do handshakewith p
        System.out.println("---" + name + " give hand to " + p.name + "---");
    }

    public void greet (Person p) {
        doHandshake(p);
        sayHello();
    }
}

class RussianPerson extends Person {
    public RussianPerson(String name) {
        super(name);
    }
    public void sayHello() {
        System.out.println("Privet!");
    }
}

class AmericanPerson extends Person {
    public AmericanPerson(String name) {
        super(name);
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class Test {
    public static void main(String[] args) {
        Person ivan = new RussianPerson("Ivan");
        Person john = new AmericanPerson("John");
        
        ivan.greet(john);
        john.greet(ivan);

    }
}