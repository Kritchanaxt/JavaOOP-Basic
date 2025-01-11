public class Dog extends Animal implements AnimalSound {

    public Dog(String name) {
        super(name);
    }

    public void move(String move) { // abstract method
        System.out.println("Moving: " + move);
    }

    public void makeSound(String sound) { // interface method
        System.out.println("Sound: " + sound);
    }

    public void makeWeight(int weight) {
        System.out.println("Weight: " + weight + " kg");
    }

}
