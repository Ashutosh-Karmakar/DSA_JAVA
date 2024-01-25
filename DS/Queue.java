package DS;

public class Queue {
    static int front = -1;
    static int rear = -1;

    static int size = 10;
    static int que[] = new int[size];

    static void enq(int i) {
        if (rear == size) {
            System.out.println("The ques is full");
            return;
        }
        que[++rear] = i;
    }

    static int deq() {
        if (front == rear) {
            System.out.println("The que is empty");
            return -1;
        }
        return que[++front];
    }

    static void displayQue() {
        for (int i : que) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        enq(1);
        enq(2);
        displayQue();
        System.err.println(deq());
        System.err.println(deq());
        System.err.println(deq());

    }
}