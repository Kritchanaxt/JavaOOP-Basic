public class Student extends Person {
    private String school;

    public Student(String name, String school) {  // Constructor
        super(name); // เรียก Constructor ของคลาสแม่
        this.school = school;
    }

    @Override // เขียนทับเมธอด คลาสแม่
    public void introduce() {
        System.out.println("I study at " + school + ".");
    }
}
