import java.util.Scanner;

public class QuadraticEquation {
    // Khai báo các thuộc tính a, b và c là private
    private double a, b, c;

    // Phương thức khởi tạo với các tham số a, b, c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Các phương thức getter cho a, b, và c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Phương thức getDiscriminant() trả về delta = b^2 - 4ac
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Phương thức getRoot1() trả về nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    // Phương thức getRoot2() trả về nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        // Hiển thị kết quả dựa trên giá trị của delta
        if (delta > 0) {
            System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
