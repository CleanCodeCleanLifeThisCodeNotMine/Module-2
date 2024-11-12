public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;
    private double baseSalary;

    public FullTimeEmployee(String code, String name, int age, String phone, String email, double bonus, double penalty, double baseSalary) {
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getNetSalary() {
        return baseSalary + (bonus - penalty);
    }
}
