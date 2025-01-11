public class Dog extends Animal implements AnimalInterface {

    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super("Mammal", name, age); // Call constructor of Animal
        this.breed = breed;
    }

    // Overloading Method
    public void bark() {
        System.out.println("Dog barks");
    }

    public void bark(String volume) {
        System.out.println("Dog barks " + volume);
    }

    // Overriding Method
    @Override
    public void display() {
        super.display(); // Call parent method
        System.out.println("Bree: " + breed);
    }

    @Override
    public void eat(String food) {
        System.out.println("Eat: " + food);
    }

    @Override
    public void sleep(String hours) {
        System.out.println("Sleep: " + hours);
    }
}
