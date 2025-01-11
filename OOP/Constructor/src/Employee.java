public class Employee extends Person {
    private double salary;

    // Default Constructor
    public Employee() {
        super(); // เรียก Default Constructor ของคลาสแม่
        this.salary = 0.0;
    }

    // Parameterized Constructor
    public Employee(String name, int age, double salary) {
        super(name, age); // เรียก Parameterized Constructor ของคลาสแม่
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
        super.display(); // เรียก method ของคลาสแม่
        System.out.println("Salary: " + salary);
    }
}
