import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo 2 mảng số
        System.out.println("Nhập kích thước của mảng 1:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Nhập kích thước của mảng 2:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 1
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng tổng kích thước của mảng 1 và 2
        int[] array3 = new int[size1 + size2];

        // Bước 4: Duyệt mảng 1 và gán vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Duyệt mảng 2 và gán vào mảng 3
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng 3 ra màn hình
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
