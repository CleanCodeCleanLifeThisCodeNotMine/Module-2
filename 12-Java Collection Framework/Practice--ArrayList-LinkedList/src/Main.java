import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua dòng trống

            switch (choice) {
                case 1: {
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    productManager.addProduct(new Product(id, name, price));
                    break;
                }
                case 2: {
                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    productManager.updateProduct(id, newName, newPrice);
                    break;
                }
                case 3: {
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int id = scanner.nextInt();
                    productManager.deleteProduct(id);
                    break;
                }
                case 4: {
                    productManager.displayProducts();
                    break;
                }
                case 5: {
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String name = scanner.nextLine();
                    productManager.searchProductByName(name);
                    break;
                }
                case 6: {
                    productManager.sortProductsByPriceAscending();
                    System.out.println("Đã sắp xếp sản phẩm tăng dần theo giá.");
                    break;
                }
                case 7: {
                    productManager.sortProductsByPriceDescending();
                    System.out.println("Đã sắp xếp sản phẩm giảm dần theo giá.");
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            }
        }
    }
}
