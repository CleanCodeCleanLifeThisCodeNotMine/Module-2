import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(8);
        // Capacity ban đầu là 8
        list.add("Giáo Sư");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");
        list.add("Đi lau nhà");

        System.out.println("Size ban đầu: " + list.size());         // In ra size hiện tại: 2
        System.out.println("Capacity ban đầu: " + 8);
        // Capacity khởi tạo: 8
        list.add("Vì bị ép"); // Thêm một phần tử vào danh sách
        System.out.println("Size sau khi thêm 1 phần tử: " + list.size()); // Size sẽ là 3
    }


    }



//get()
//add()
//remove()
//size(): lấy về số lượng phần tử trong mảng arraylist
//find()
//isEmpty(): Kiểm tra rỗng

//add(e: E): void: Thêm phần tử e vào danh sách.
//add(index: int, e: E): void: Thêm phần tử e vào vị trí index.
//clear(): void: Xóa tất cả phần tử trong danh sách.
//contains(e: E): boolean: Kiểm tra xem danh sách có chứa phần tử e không.
//get(index: int): E: Lấy phần tử tại vị trí index.
//indexOf(e: E): int: Trả về vị trí đầu tiên của phần tử e trong danh sách (hoặc -1 nếu không tìm thấy).
//isEmpty(): boolean: Kiểm tra danh sách có rỗng hay không.
//lastIndexOf(e: E): int: Trả về vị trí cuối cùng của phần tử e trong danh sách (hoặc -1 nếu không tìm thấy).
//remove(e: E): boolean: Xóa phần tử e khỏi danh sách, trả về true nếu thành công.
//size(): int: Trả về số lượng phần tử trong danh sách.
//remove(index: int): E: Xóa phần tử tại vị trí index và trả về phần tử đã xóa.
//set(index: int, e: E): E: Cập nhật phần tử tại vị trí index thành e, trả về phần tử trước khi cập nhật.

//+add(element: E): void: Thêm phần tử element vào danh sách tại vị trí hiện tại.
//        +hasPrevious(): boolean: Kiểm tra xem có phần tử trước phần tử hiện tại không.
//        +nextIndex(): int: Trả về chỉ số của phần tử tiếp theo trong danh sách.
//        +previous(): E: Trả về phần tử trước phần tử hiện tại và di chuyển con trỏ về phía trước.
//+previousIndex(): int: Trả về chỉ số của phần tử trước phần tử hiện tại.
//        +set(element: E): void: Cập nhật phần tử cuối cùng được trả về bằng next() hoặc previous() thành element.

//+ArrayList(): Constructor không tham số, tạo một ArrayList trống với dung lượng mặc định.
//        +ArrayList(c: Collection<? extends E>): Constructor nhận vào một Collection và tạo một ArrayList chứa tất cả các phần tử của Collection đó.
//        +ArrayList(initialCapacity: int): Constructor nhận vào một giá trị initialCapacity (dung lượng ban đầu) và tạo một ArrayList trống với dung lượng ban đầu đã chỉ định.
//        +trimToSize(): void: Cắt dung lượng của ArrayList để phù hợp với số phần tử hiện tại, giúp tiết kiệm bộ nhớ nếu capacity lớn hơn size hiện tại.