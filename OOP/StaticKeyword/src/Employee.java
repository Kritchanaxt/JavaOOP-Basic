public class Employee {
    public static int minSalary = 2000;
    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Minimum Salary: " + minSalary);
    }

    public static void updateMinSalary(int newMinSalary) {
        minSalary = newMinSalary;
        System.out.println("Minimum Salary updated to: " + minSalary);
    }
}
