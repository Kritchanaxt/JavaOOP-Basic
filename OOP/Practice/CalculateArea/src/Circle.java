public class Circle extends Shape {

    // Constructor
    public Circle(double radius) {
        super(radius, 0 , 0); // Call Constructor from SuperClass
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

}
