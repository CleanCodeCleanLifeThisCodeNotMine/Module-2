import java.util.Scanner; // Nhập khẩu lớp Scanner để đọc dữ liệu đầu vào từ bàn phím

public class PrimeNumbers {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu đầu vào
        Scanner scanner = new Scanner(System.in);

        // Khai báo một biến kiểu số nguyên để lưu số lượng số nguyên tố cần hiển thị
        int numbers;
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        // Đọc số lượng số nguyên tố từ người dùng
        numbers = scanner.nextInt();

        // Khởi tạo biến đếm để đếm số lượng số nguyên tố đã tìm thấy
        int count = 0;
        // Khởi tạo N, bắt đầu từ số nguyên tố đầu tiên là 2
        int N = 2;

        // In ra số lượng số nguyên tố sẽ được hiển thị
        System.out.println("Các số nguyên tố đầu tiên: " + numbers);

        // Lặp lại cho đến khi tìm đủ số lượng số nguyên tố yêu cầu
        while (count < numbers) {
            // Kiểm tra nếu số hiện tại N là số nguyên tố
            if (isPrime(N)) {
                // In số nguyên tố đó ra màn hình, theo sau là một khoảng trắng
                System.out.print(N + " ");
                // Tăng biến đếm của số nguyên tố tìm được
                count++;
            }
            // Tăng N để kiểm tra số tiếp theo
            N++;
        }
    }

    /**
     * Kiểm tra một số có phải là số nguyên tố
     * @param num Số cần kiểm tra
     * @return true nếu num là số nguyên tố, false nếu không phải
     */
    public static boolean isPrime(int num) {
        // Số nguyên tố là số lớn hơn 1 và không có ước số nào khác ngoài 1 và chính nó
        if (num <= 1) return false; // Trả về false nếu num nhỏ hơn hoặc bằng 1
        // Kiểm tra tính chia hết từ 2 đến căn bậc hai của num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // Trả về false nếu num chia hết cho bất kỳ số nào khác ngoài 1 và chính nó
        }
        // Trả về true nếu không tìm thấy ước số nào, tức là num là số nguyên tố
        return true;
    }
}
