import java.time.LocalDate;

public abstract class Material {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material (){}

    public Material(String ID, String Name, LocalDate manufacturingDate, int cost) {
        this.id = ID;
        this.name = Name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public String getID() {
        return id;
    }
    public void setID(String ID) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
    public abstract double getRealMoney();
}
