public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle với bán kính mặc định
        Circle circle1 = new Circle();
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        // Tạo đối tượng Circle với bán kính được chỉ định
        Circle circle2 = new Circle(2.5);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
