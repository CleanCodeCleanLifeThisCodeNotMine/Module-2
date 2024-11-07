import java.util.Scanner;

public class AddElementtoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        System.out.println("Nhập số lượng phần tử của mảng:");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.println("Nhập giá trị cần chèn:");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.println("Nhập vị trí cần chèn giá trị:");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra điều kiện vị trí chèn
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không thể chèn phần tử vào vị trí này trong mảng.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào mảng
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn phần tử:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
