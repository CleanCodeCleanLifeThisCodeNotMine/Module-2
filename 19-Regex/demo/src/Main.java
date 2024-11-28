public class Main {
    public static void main(String[] args) {
        String EMAIL_REGEX = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        String email1 = "user@domain.com";
        boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email1 + " : Valid = " + b);

        String email2 = "user^domain.co.in";
        b = email2.matches(EMAIL_REGEX);
        System.out.println("is e-mail: " + email2 + " : Valid = " + b);
    }
}
