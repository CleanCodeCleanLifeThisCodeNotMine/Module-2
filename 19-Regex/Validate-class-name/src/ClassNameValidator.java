import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassNameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Định nghĩa regex để kiểm tra tên lớp học
        String classNameRegex = "^[CAP]\\d{4}[GHIK]$";

        System.out.print("Nhập tên lớp học để kiểm tra: ");
        String className = scanner.nextLine();

        // Kiểm tra tính hợp lệ
        boolean isValid = isValidClassName(className, classNameRegex);

        // Hiển thị kết quả
        if (isValid) {
            System.out.println("Tên lớp hợp lệ: " + className);
        } else {
            System.out.println("Tên lớp không hợp lệ: " + className);
        }

        scanner.close();
    }

    // Phương thức kiểm tra tên lớp học có hợp lệ hay không
    public static boolean isValidClassName(String className, String regex) {
        return Pattern.matches(regex, className);
    }
}
