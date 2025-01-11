public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone, String socialSecurity, double payRate) {
        super(name, address, phone, socialSecurity, payRate);
        this.bonus = 0;
    }

    public void awardBonus (double execBonus) {
        this.bonus = execBonus;
    }

    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
