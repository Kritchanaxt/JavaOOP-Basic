public class Main {
    public static void main(String[] args) {

        Animal d = new Dog("Got");
        Animal c = new Cat("Kitty");

        System.out.println();
        d.display();
        d.move("Run");
        d.makeSound("Hog");
        d.makeWeight(20);

        System.out.println();
        c.display();
        c.move("Jump");
        c.makeSound("Meow");
        d.makeWeight(13);

    }
}