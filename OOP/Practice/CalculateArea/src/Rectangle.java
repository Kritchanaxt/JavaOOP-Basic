public class Rectangle extends Shape {

    // Constructor
    public Rectangle(double weight, double length) {
        super(0, 0, weight); // Call Constructor from SuperClass
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * getWeight();
    }

    @Override
    public void display() {
        System.out.println("Weight: " + getWeight());
        System.out.println("Length: " + length);
        System.out.println("Area: " + calculateArea());
    }
}
