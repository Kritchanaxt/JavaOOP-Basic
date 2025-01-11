public class Animal extends BaseEntity implements AnimalInterface {

    private String name; // Encapsulation
    private int age;

    // Constructor
    public Animal(String entityType, String name, int age) {
        super(entityType); // Call constructor of BaseEntity
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Animal: " + name + ", Age: " + age + ", Type:" + getEntityType());
    }


    public void eat(String food) {

    }

    public void sleep(String hours) {

    }

}
