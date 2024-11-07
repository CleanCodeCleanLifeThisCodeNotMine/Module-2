public class OnlyFan {
    // Hằng số cho các mức tốc độ quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính của lớp Fan
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số, tạo đối tượng Fan mặc định
    public OnlyFan() {
        this.speed = SLOW;      // Mặc định là SLOW
        this.on = false;        // Mặc định là tắt
        this.radius = 5;        // Mặc định là 5
        this.color = "blue";    // Mặc định là "blue"
    }

    // Getter và Setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString trả về chuỗi mô tả trạng thái của quạt
    @Override
    public String toString() {
        if (on) {
            return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
        } else {
            return "Fan is off: color = " + color + ", radius = " + radius;
        }
    }

    public static void main(String[] args) {
        // Tạo hai đối tượng Fan
        OnlyFan fan1 = new OnlyFan();
        fan1.setSpeed(FAST);       // Tốc độ tối đa
        fan1.setRadius(10);        // Bán kính 10
        fan1.setColor("yellow");   // Màu vàng
        fan1.setOn(true);          // Bật quạt

        OnlyFan fan2 = new OnlyFan();
        fan2.setSpeed(MEDIUM);     // Tốc độ trung bình
        fan2.setRadius(5);         // Bán kính 5
        fan2.setColor("blue");     // Màu xanh
        fan2.setOn(false);         // Tắt quạt

        // Hiển thị thông tin của hai đối tượng Fan
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
