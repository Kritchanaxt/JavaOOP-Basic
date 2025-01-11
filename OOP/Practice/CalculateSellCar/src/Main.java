public class Main {
    public static void main(String[] args) {

        System.out.println();
        CalculateCar car = new CalculateCar("Toyota", 459000.23, 10);
        car.display();
        car.calculateSalePrice(car.getPrice());

        System.out.println();
        car.setName("Mazda");
        car.setPrice(360000.52);
        car.setDiscount(20);
        car.display();
        car.calculateSalePrice(car.getPrice());

        System.out.println();
        car.setName("Honda");
        car.setPrice(1000000);
        car.setDiscount(30);
        System.out.println("Name Car: " + car.getName());
        System.out.println("Price Car: " + car.getPrice());
        System.out.println("Discount Car: " + car.getDiscount() + "%");
    }
}