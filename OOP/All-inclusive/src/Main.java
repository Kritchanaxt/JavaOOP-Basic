public class Main {
    public static void main(String[] args) {

        System.out.println();

        // Static method call from interface
        AnimalInterface.animalClass();

        System.out.println();

        // Upcasting and Polymorphism
        Animal animal = new Dog("Buddy", 5, "Golden Retriever");
        animal.display();

        System.out.println();

        // Downcasting
        if (animal instanceof Dog) { // Checks if animal is an instance of the Dog class.
            Dog dog = (Dog) animal; // Cast the animal object from class Animal to class Dog.
            dog.bark();
            dog.bark("loudly");
        }

        System.out.println();

        animal.eat("Pellets");
        animal.sleep("10 hours");

    }
}