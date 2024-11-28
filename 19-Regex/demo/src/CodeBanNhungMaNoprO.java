import java.util.Scanner;

public class CodeBanNhungMaNoprO {
    public static void main(String[] args) {
        String EMAIL_REGEX = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập email để kiểm tra: ");
        String email = scanner.nextLine();
        boolean isValid = email.matches(EMAIL_REGEX);
        System.out.println("Email: " + email + " : Valid = " + isValid);
        scanner.close();
    }
}
