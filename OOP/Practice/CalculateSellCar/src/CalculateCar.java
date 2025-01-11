public class CalculateCar extends Car {

    public CalculateCar(String name, double price, int discount) {
        super(name, price, discount);
    }

    @Override
    public void calculateSalePrice(double price) {
        double discountAmount = (getPrice() * getDiscount()) / 100;
        double finalPrice = getPrice() - discountAmount;
        System.out.println("Sale Price: " + finalPrice);
    }
}
