import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // TB
    public double AvgSalary() {
        double TotalSalary = 0;
        for (Employee employee : employees) {
            TotalSalary += employee.getNetSalary();
        }
        return employees.isEmpty() ? 0 : TotalSalary / employees.size();
    }

    // fulltime thap hon tb
    public List<FullTimeEmployee> ListFullTimeSalarylessthanAvg() {
        double AvgSalary = AvgSalary();
        List<FullTimeEmployee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee && employee.getNetSalary() < AvgSalary) {
                result.add((FullTimeEmployee) employee);
            }
        }
        return result;
    }

    // parttime
    public double TotalPartTimeSalary() {
        double TotalPartTime = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                TotalPartTime += employee.getNetSalary();
            }
        }
        return TotalPartTime;
    }

    // sap xep
    public List<FullTimeEmployee> ListBySalary() {
        List<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                fullTimeEmployees.add((FullTimeEmployee) employee);
            }
        }
        fullTimeEmployees.sort((nv1, nv2) -> Double.compare(nv1.getNetSalary(), nv2.getNetSalary()));
        return fullTimeEmployees;
    }
}
