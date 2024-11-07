import java.util.Scanner;

public class Rectangle {
    double width, height;

//    public Rectangle() {
//
//    }
    //Khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
