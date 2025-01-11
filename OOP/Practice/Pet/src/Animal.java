abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public abstract void move(String move);

    // interface method
    public void makeSound(String sound) {

    }

    public void makeWeight(int weight) {

    }
}
