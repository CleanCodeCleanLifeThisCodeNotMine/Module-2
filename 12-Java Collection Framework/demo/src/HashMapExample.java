import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // Bước 1: Khởi tạo đối tượng HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Bước 2: Thêm các cặp key-value bằng phương thức put()
        hashMap.put("apple", 3);
        hashMap.put("banana", 5);
        hashMap.put("orange", 2);

        // Bước 3: In ra đối tượng HashMap
        System.out.println("HashMap: " + hashMap);
    }
}
