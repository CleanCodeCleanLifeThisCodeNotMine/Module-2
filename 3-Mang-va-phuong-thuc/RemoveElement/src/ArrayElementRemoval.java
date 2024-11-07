import java.util.Scanner;

public class ArrayElementRemoval {
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

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.println("Nhập phần tử cần xoá:");
        int X = scanner.nextInt();

        // Bước 3: Tìm X trong mảng
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tìm thấy trong mảng.");
        } else {
            // Bước 4: Xoá phần tử X khỏi mảng
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Giảm kích thước mảng xuống 1 đơn vị
            N--;

            // Bước 5: In ra mảng mới
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
