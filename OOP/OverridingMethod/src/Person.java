public class Person {
    private String name;

    public Person(String name) { // Constructor
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, My name is "+ name + ".");
    }

}
