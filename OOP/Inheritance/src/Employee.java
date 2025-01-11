public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        super(name, age); // เรียกใช้ constructor ของคลาสแม่
        this.position = position;
        this.salary = salary;
    }

    @Override // เขียนทับเมธอดของแม่
    public void display() {
        super.display(); // เรียกใช้เมธอดของคลาสแม่
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public void work() {
        System.out.println(name + "is working as a " + position);
    }
}
