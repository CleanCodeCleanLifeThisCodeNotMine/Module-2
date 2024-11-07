import java.util.Scanner;

public class MatrixMaxElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Nhập kích thước và các phần tử của ma trận
        System.out.println("Nhập vào số dòng của ma trận:");
        int rows = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận:");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập vào các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 1: Tìm phần tử lớn nhất
        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Thông báo kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxElement + " tại vị trí (" + maxRow + ", " + maxCol + ")");
    }
}
