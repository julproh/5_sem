public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this("No Name");
    }

    public void addToGroup(Group group) {
        group.addStudent(this);
    }

    public static void main(String[] args){
        System.out.println("Cool!");
    }
}

class Group {
    public Group addStudent(Student student) {
        return new Group();
    }
}