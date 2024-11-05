//Kiểm tra số nguyên tố

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Khai báo biến số nguyên number và nhập cho number giá trị từ bàn phím trong hàm main()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Not a prime number");
        } else {
            int i = 2;
            boolean check = true;
//            while (i <= number) {
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println("Prime number");
            else
                System.out.println("Not a prime number");
        }

    }
}
