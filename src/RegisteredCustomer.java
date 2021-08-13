import java.util.ArrayList;

public class RegisteredCustomer extends Customer{

    private int discount;
    private double registrationFees;

    public RegisteredCustomer(int id, String name, int discount, double registrationFees) {
        super(id, name);
        this.discount = discount;
        this.registrationFees = registrationFees;
    }

    public double TotalOrderValue() {
        double Total = super.TotalOrderValue();
        Total -= Total*discount/100;
        return Total;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getRegistrationFees() {
        return registrationFees;
    }

    public void setRegistrationFees(double registrationFees) {
        this.registrationFees = registrationFees;
    }
}
