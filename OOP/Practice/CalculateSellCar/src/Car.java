abstract class Car {
    private String name;
    private double price;
    private int discount;

    public Car(String name, double price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
    }

    public abstract void calculateSalePrice(double price);

}
