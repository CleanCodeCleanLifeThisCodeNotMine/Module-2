//[Bài tập] Hiển thị các loại hình

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Show Rectangle");
            System.out.println("2. Show Triangle (square edge bottom-left)");
            System.out.println("3. Show Triangle (square edge top-left)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the width: ");
                    int width = input.nextInt();
                    System.out.print("Enter the height: ");
                    int height = input.nextInt();
                    showRectangle(width, height);
                    break;
                case 2:
                    System.out.print("Enter the height of the triangle: ");
                    int heightBL = input.nextInt();
                    showTriangleBottomLeft(heightBL);
                    break;
                case 3:
                    System.out.print("Enter the height of the triangle: ");
                    int heightTL = input.nextInt();
                    showTriangleTopLeft(heightTL);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void showRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void showTriangleBottomLeft(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void showTriangleTopLeft(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
