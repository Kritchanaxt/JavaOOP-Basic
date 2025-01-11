public class Calculator {
    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3, 5));         // เรียก add(int, int)
        System.out.println(calc.add(4.5, 5.5));     // เรียก add(double, double)
        System.out.println(calc.add(1, 2, 3));      // เรียก add(int, int, int)
    }
}
