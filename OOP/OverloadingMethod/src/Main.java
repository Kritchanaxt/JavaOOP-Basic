public class Main {
    public static void main(String[] args) {

        System.out.println();
        MathOperations mathOps = new MathOperations();
        System.out.println("Addition (int, int): " + mathOps.add(20, 10));
        System.out.println("Addition (double, double): " + mathOps.add(10.5, 9.5));
        System.out.println("Addition (int, int, int): " + mathOps.add(10, 20, 30));

        System.out.println();
        Student student = new Student("gotE3", 40);
        student.display();
    }
}