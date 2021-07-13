interface Animal {
    void eat();
    void sleep();
    void walk();
    //void run();
}

// java.lang:
// interface Runnable {
//     abstract public void run(); //execute code in parallel thread
// }

class Cat implements Animal, Runnable {
    public void eat() {
        // eat whiskas, drink milk
    }
    
    public void sleep() {
        // sleep im warm place
    }

    public void walk() {
        //walk quietly
    }

    public void run() {
        // run
    }
}