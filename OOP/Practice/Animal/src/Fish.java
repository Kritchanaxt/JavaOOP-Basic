public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is swimming around playfully.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fish food.");
    }

}
