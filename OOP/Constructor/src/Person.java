public class Person {
    private String name;
    private int age;

    // Default Constructor (ไม่มีพารามิเตอร์)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor (มีพารามิเตอร์)
    public Person(String name, int age) {
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

    public void setAge(int ago) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
