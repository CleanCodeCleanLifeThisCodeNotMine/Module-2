import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        // Bước 1: Khởi tạo đối tượng TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Bước 2: Thêm các cặp key-value bằng phương thức put()
        treeMap.put("apple", 3);
        treeMap.put("banana", 5);
        treeMap.put("orange", 2);

        // Bước 3: In ra đối tượng TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
