public class Main {
    public static void main(String[] args) {

        System.out.println();

        Person p1 = new Person();
        p1.display();
        System.out.println();

        Person p2 = new Person("Alice", 25);
        p2.display();
        System.out.println();

        Employee emp1 = new Employee();
        emp1.display();
        System.out.println();

        Employee emp2 = new Employee("Bob", 30, 50000);
        emp2.display();
    }
}