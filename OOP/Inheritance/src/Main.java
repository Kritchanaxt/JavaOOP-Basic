public class Main {
    public static void main(String[] args) {

        System.out.println();
        Person p = new Person("Got", 24);
        p.display();

        System.out.println();
        Employee emp = new Employee("Bob", 35, "Manager", 50000);
        emp.display();

        System.out.println();
        emp.work();

    }
}