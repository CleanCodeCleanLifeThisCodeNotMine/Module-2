class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i += 2) { // Số lẻ từ 1 đến 10
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(10); // Dừng 10 milliseconds
            } catch (InterruptedException e) {
                System.out.println("OddThread interrupted");
            }
        }
    }
}
