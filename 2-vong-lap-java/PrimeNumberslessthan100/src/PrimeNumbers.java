public class PrimeNumbers {
    //[Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    /**
     * Kiểm tra xem một số có phải là số nguyên tố không.
     * Số nguyên tố là số chỉ chia hết cho 1 và chính nó.
     *
     * @param num Số cần kiểm tra
     * @return true nếu num là số nguyên tố, false nếu không
     */
    public static boolean isPrime(int num) {
        // Số nguyên tố phải lớn hơn 1
        if (num <= 1) {
            return false;
        }
        // Chỉ cần kiểm tra tới căn bậc hai của num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // num chia hết cho i, không phải số nguyên tố
            }
        }
        return true; // num không chia hết cho bất kỳ số nào khác ngoài 1 và chính nó, là số nguyên tố
    }

    /**
     * Phương thức chính để thực hiện chương trình, hiển thị các số nguyên tố nhỏ hơn 100.
     */
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        // Lặp từ 2 đến 99 và kiểm tra từng số
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {  // Kiểm tra tính nguyên tố
                System.out.print(i + " ");  // In số nguyên tố ra màn hình
            }
        }
    }
}
