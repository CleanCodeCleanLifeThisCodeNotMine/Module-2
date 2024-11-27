import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
    }

    // Sửa thông tin sản phẩm theo ID
    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID: " + id);
    }

    // Xóa sản phẩm theo ID
    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    // Sắp xếp sản phẩm tăng dần theo giá
    public void sortProductsByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    // Sắp xếp sản phẩm giảm dần theo giá
    public void sortProductsByPriceDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
