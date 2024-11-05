//[Bài tập] Hiển thị 20 số nguyên tố đầu tiên

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        System.out.print("Enter numbers: ");
        numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        System.out.println("First: " + numbers + "prime numbers");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
    //Ham kiem tra cac so nguyen
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
