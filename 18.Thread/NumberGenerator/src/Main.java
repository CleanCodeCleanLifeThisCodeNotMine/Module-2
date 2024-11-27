public class Main {
    public static void main(String[] args) {
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 thread từ các đối tượng generator
        Thread thread1 = new Thread(generator1, "Thread 1");
        Thread thread2 = new Thread(generator2, "Thread 2");

        // Thay đổi priority của 2 thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Khởi chạy cả 2 thread
        thread1.start();
        thread2.start();
    }
}