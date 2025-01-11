public class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Overloading: Constructor accept 2 parameters
    public Student(String name, int age) {
        this.name = name;
        System.out.println("Age: "+ age);
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}
