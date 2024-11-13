import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {}
    public Meat(String id, String name, LocalDate manufactureDate, int cost, double weight) {
        super(id, name, manufactureDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount(){
        return getCost()*weight;
    }

    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return getAmount() * 0.97;
    }
}
