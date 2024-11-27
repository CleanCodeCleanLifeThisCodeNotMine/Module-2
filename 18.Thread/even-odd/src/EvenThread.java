class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10000; i += 2) { // Số chẵn từ 1 đến 10
            System.out.println("EvenThread: " + i);
            try {
                Thread.sleep(15); // Dừng 15 milliseconds
            } catch (InterruptedException e) {
                System.out.println("EvenThread interrupted");
            }
        }
    }
}
