import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Bước 1: Khởi tạo đối tượng LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Bước 2: Thêm các cặp key-value bằng phương thức put()
        linkedHashMap.put("apple", 3);
        linkedHashMap.put("banana", 5);
        linkedHashMap.put("orange", 2);

        // Bước 3: In ra đối tượng LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
