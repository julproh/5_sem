

class Cat implements Voice {

    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }
}


class Dog implements Voice {

    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }
}


class Cow implements Voice {

    @Override
    public void voice() {
        System.out.println("Mu-mu");
    }
}

public class Animals {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        System.out.print("Cat say: "); 
        cat.voice();

        System.out.print("Dog say: ");
        dog.voice();

        System.out.print("Cow say: ");
        cow.voice();
    };
}