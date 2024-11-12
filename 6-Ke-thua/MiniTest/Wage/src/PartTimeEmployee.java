public class PartTimeEmployee extends Employee {
    private int workHours;

    public PartTimeEmployee(String code, String name, int age, String phone, String email, int workHours) {
        super(code, name, age, phone, email);
        this.workHours = workHours;
    }
    //thang ban bao ko can getter setter?
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public double getNetSalary() {
        return workHours * 100000;
    }
}
