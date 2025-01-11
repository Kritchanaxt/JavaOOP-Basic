public class Main {
    public static void main(String[] args) {

        System.out.println("\n -- Shape -- ");
        Shape s = new Shape(12.2, 10.75, 20.25);
        s.calculateArea();
        s.display();

        System.out.println("\n -- Circle -- ");
        Circle c = new Circle(40);
        c.calculateArea();
        c.display();

        System.out.println("\n -- Rectangle -- ");
        Rectangle r = new Rectangle(100, 200);
        r.calculateArea();
        r.display();

        System.out.println("\n -- Custom -- ");
        s.setHeight(200);
        s.setRadius(10);
        s.setWeight(50);
        System.out.println("Radius: " + s.getRadius());
        System.out.println("Height: " + s.getHeight());
        System.out.println("Weight: " + s.getWeight());
        System.out.println("Area: " + s.calculateArea());
    }
}