import java.util.Arrays;

public class InsertionSortVisualization {
    public static void main(String[] args) {
        // Định nghĩa mảng các số nguyên
        int[] numbers = {8, 3, 5, 7, 2, 4, 6, 1};

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: " + Arrays.toString(numbers));

        // Gọi hàm sắp xếp chèn và hiển thị từng bước
        insertionSortWithSteps(numbers);
    }

    public static void insertionSortWithSteps(int[] array) {
        int n = array.length;

        // Bắt đầu thuật toán sắp xếp chèn
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn `key` sang bên phải
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Chèn `key` vào đúng vị trí
            array[j + 1] = key;

            // Hiển thị trạng thái của mảng sau mỗi bước
            System.out.println("Bước " + i + ": " + Arrays.toString(array));
        }

        // Hiển thị kết quả cuối cùng
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(array));
    }
}
