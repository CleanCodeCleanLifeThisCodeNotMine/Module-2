// Node class
class Node {
    int data;
    Node link;

    // Constructor
    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

// Queue class
class Queue {
    Node front, rear;

    // Constructor
    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue: Thêm phần tử vào hàng đợi
    void enQueue(int value) {
        Node newNode = new Node(value);

        // Kiểm tra hàng đợi trống
        if (front == null) {
            front = rear = newNode;
            rear.link = front; // Trỏ rear đến front
        } else {
            rear.link = newNode; // Rear trỏ đến node mới
            rear = newNode; // Rear chuyển thành node mới
            rear.link = front; // Rear trỏ lại front để tạo vòng lặp
        }
    }

    // Dequeue: Xóa phần tử đầu tiên trong hàng đợi
    int deQueue() {
        // Kiểm tra hàng đợi trống
        if (front == null) {
            System.out.println("Hàng đợi trống!");
            return -1;
        }

        int value; // Giá trị sẽ được trả về
        // Nếu front == rear (chỉ có một phần tử)
        if (front == rear) {
            value = front.data;
            front = rear = null; // Xóa phần tử duy nhất
        } else {
            Node temp = front; // Lưu front hiện tại
            value = temp.data;
            front = front.link; // Front chuyển sang node tiếp theo
            rear.link = front; // Rear trỏ lại front
        }
        return value;
    }

    // Hiển thị hàng đợi
    void displayQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống!");
            return;
        }
        Node temp = front;
        System.out.println("Các phần tử trong hàng đợi:");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front); // Lặp lại đến khi quay lại front
        System.out.println();
    }
}

// Solution class
public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue các phần tử
        queue.enQueue(14);
        queue.enQueue(22);
        queue.enQueue(-6);

        // Hiển thị hàng đợi
        queue.displayQueue();

        // Dequeue phần tử đầu tiên
        System.out.println("Phần tử bị xóa: " + queue.deQueue());

        // Hiển thị hàng đợi sau khi dequeue
        queue.displayQueue();

        // Thêm các phần tử khác
        queue.enQueue(9);
        queue.enQueue(20);

        // Hiển thị hàng đợi sau khi thêm mới
        queue.displayQueue();
    }
}
