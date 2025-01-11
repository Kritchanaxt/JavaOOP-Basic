public class Shape {

    protected double length;
    protected double radius;
    private double height;
    private double weight;

    // Constructor
    public Shape(double radius, double height, double weight) {
        this.radius = radius;
        this.height = height;
        this.weight = weight;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public double calculateArea() {
        return Math.PI * radius * height * weight;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Area: " + calculateArea());
    }

}
