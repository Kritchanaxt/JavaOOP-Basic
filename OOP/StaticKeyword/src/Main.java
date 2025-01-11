public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("got", 3000);
        Employee emp2 = new Employee("E3", 6000);

        System.out.println();
        emp1.display();
        emp2.display();

        System.out.println("\n-- Update --");
        Employee.updateMinSalary(2200);
        emp1.display();
        emp2.display();
    }
}