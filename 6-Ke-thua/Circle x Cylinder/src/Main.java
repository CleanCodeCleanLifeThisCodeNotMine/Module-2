public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0, "black");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0, 2.0, "black" );
    }
}