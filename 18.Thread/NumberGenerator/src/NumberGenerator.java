class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - Number: " + i +
                    " - HashCode: " + this.hashCode());
            try {
                Thread.sleep(500); // Dừng 500ms
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }
}
