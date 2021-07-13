class Employee{
    String name;
    public Employee(String name) {
        this.name = name;
    }
    public String toString() {
        return "Name: " + name;
    }
}

public class Manager extends Employee {
    String department;

    public Manager(String name, String department) {
     super(name);
     this.department = department;   
    }

    public String toString() {
        return super.toString() + "is manager of " + department;
    }

    public static void main (String[] args) {
        System.out.println("Manager");
    }
}