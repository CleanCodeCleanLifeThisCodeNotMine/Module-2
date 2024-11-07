public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số khởi tạo startTime với thời gian hiện tại
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức start để đặt startTime về thời gian hiện tại của hệ thống
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức stop để đặt endTime về thời gian hiện tại của hệ thống
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Phương thức getElapsedTime trả về thời gian đã trôi qua (milisecond)
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
