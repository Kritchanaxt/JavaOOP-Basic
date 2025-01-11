public class Employee extends Person {
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display(); // เรียกใช้เมธอดของคลาสแม่
        System.out.println("Salary: " + salary);
    }
}

