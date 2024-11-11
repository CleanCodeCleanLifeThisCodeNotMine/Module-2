public class Circle {
    // Các thuộc tính với access modifier là private
    private double radius = 1.0;
    private String color = "red";

    // Hàm tạo không có tham số
    public Circle() {
    }

    // Hàm tạo với một tham số là bán kính
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức getRadius với access modifier là public
    public double getRadius() {
        return radius;
    }

    // Phương thức getArea với access modifier là public
    double getArea() {
        return Math.PI * radius * radius;
    }
}
