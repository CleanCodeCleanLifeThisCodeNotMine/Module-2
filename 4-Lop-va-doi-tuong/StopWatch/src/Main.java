import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo một mảng 100,000 số ngẫu nhiên
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        // Tạo đối tượng StopWatch và đo thời gian sắp xếp chọn
        StopWatch stopwatch = new StopWatch();
        stopwatch.start(); // Bắt đầu đo thời gian

        selectionSort(array); // Thực thi thuật toán sắp xếp chọn

        stopwatch.stop(); // Kết thúc đo thời gian

        System.out.println("Elapsed time for selection sort on 100,000 elements: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Hàm sắp xếp chọn (selection sort)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
