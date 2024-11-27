public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start cả hai thread
        oddThread.start();
        evenThread.start();
    }
}
