public class Main {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.setName("Got");

        Cat c = new Cat("Scooby");

        Animal s = new Spider();

        System.out.println();
        System.out.println("--- Fish ---");
        System.out.println("Name: " + f.getName());
        f.play();
        f.walk();
        f.eat();

        System.out.println("\n--- Cat ---");
        System.out.println("Name: " + c.getName());
        c.play();
        c.walk();
        c.eat();

        System.out.println("\n--- Spider ---");
        s.walk();
        s.eat();

    }
}