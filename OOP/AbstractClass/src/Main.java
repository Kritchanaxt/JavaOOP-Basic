public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println();
        p1.Register();
        p1.setID("123");
        System.out.println("ID = "+p1.getID());
    }
}