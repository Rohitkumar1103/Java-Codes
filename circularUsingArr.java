
public class circularUsingArr {

    static class Queue {

        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public static int deque() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            //last element 
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.deque());
        q.enqueue(4);
        System.out.println(q.deque());
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }
}
