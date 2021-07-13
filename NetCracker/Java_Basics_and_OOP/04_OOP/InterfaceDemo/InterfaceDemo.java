interface Speakable {
    void speak();
}

class Human implements Speakable{
    public void speak() { // must be public
        System.out.println("Hello! How are you?");
    }
}

class Cat implements Speakable {
    public void speak() {
        System.out.println("Meow");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Speakable[] creatures = {new Human(), new Cat(), new Cat()};

        for (Speakable s:creatures) {
            s.speak();
        }
    }
}