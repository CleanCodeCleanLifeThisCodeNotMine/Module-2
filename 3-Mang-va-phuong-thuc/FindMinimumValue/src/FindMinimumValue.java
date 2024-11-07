import java.util.Scanner;

public class FindMinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.println("Nhập kích thước của mảng:");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 3 và 4: Tìm giá trị nhỏ nhất trong mảng
        int minValue = array[0];  // Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];  // Cập nhật giá trị nhỏ nhất
            }
        }

        // Bước 5: In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}
