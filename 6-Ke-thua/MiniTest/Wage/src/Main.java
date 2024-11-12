import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // fullTime
        company.addEmployee(new FullTimeEmployee("ID02", "Son", 30, "123456789", "sondeptraisieucapvodichvutru@gmail.com", 2000, 500, 10000));
        company.addEmployee(new FullTimeEmployee("ID03", "Dung", 40, "987654321", "teemodirung15gg@dayxahoi.com", 1500, 300, 12000));
        company.addEmployee(new FullTimeEmployee("ID01", "Manh", 28, "555555555", "MANH@gov.com", 1000, 100, 11000));

        // partTime
        company.addEmployee(new PartTimeEmployee("ID05", "Vuong", 22, "222222222", "ngodocthucpham@food.court", 50));
        company.addEmployee(new PartTimeEmployee("ID06", "Giao Su", 25, "333333333", "chungketthegioi@riot.com", 60));

        // avg salary
        double AvgSalary = company.AvgSalary();
        System.out.println("Luong trung binh cua cong ty: " + AvgSalary);

        // fulltime < avg
        List<FullTimeEmployee> fullTimeSalarylessthanAvg = company.ListFullTimeSalarylessthanAvg();
        System.out.println("Nhan vien fulltime luong thap hon avg: ");
        for (FullTimeEmployee nv : fullTimeSalarylessthanAvg) {
            System.out.println(nv.getName() + " - Lương: " + nv.getNetSalary());
        }

        // total partime salary
        double totalPartTimeSalary = company.TotalPartTimeSalary();
        System.out.println("Tong luong cua partTime" + totalPartTimeSalary);

        // Sap xep tang dan
        List<FullTimeEmployee> fullTimeEmployees = company.ListBySalary();
        System.out.println("Luong nhan vien theo thu tu tang dan");
        for (FullTimeEmployee nv : fullTimeEmployees) {
            System.out.println(nv.getName() + " - Lương: " + nv.getNetSalary());
        }
    }
}
