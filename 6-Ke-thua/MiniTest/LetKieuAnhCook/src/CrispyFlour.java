import java.time.LocalDate;

public class CrispyFlour extends Material {

    private int quantity;

    public CrispyFlour() {}

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public double getAmount() {
        return getCost() * quantity;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return getAmount() * 0.94;
    }
}
