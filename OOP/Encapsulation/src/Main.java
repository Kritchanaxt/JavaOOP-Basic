public class Main {
    public static void main(String[] args) {

        System.out.println();
        Person p = new Person("E3", 35);
        p.display();
        System.out.println();

        p.setAge(30);
        p.display();
        System.out.println();

        Employee emp = new Employee("Bob", 35, 50000);
        emp.display();
        System.out.println();

        emp.setSalary(60000);
        emp.display();
    }
}