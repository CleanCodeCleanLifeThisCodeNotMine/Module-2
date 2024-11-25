import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        // Mảng số nguyên
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        printArray(array);

        // Đảo ngược mảng bằng Stack
        reverseArray(array);

        System.out.println("Mảng sau khi đảo ngược:");
        printArray(array);
    }

    // Hàm đảo ngược mảng
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Push các phần tử của mảng vào Stack
        for (int num : array) {
            stack.push(num);
        }

        // Pop các phần tử từ Stack và đưa lại vào mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // Hàm in mảng
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
