public class circularQue {
    static int size = 5;
    static int[] que = new int[size];
    static int front = -1;
    static int rear = -1;

    static void enque(int key){
        if((rear+1)%size == front){
            System.out.println("The Que is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
            que[rear] = key;
        }
        else{
            rear = (rear + 1) % size;
            que[rear] = key;
        }
    }

    static int deque(){
        if(front == -1){
            System.out.println("The que is empty");
            return -1;
        }
        int key = que[front];
        if(front == rear){
            front = -1;
            rear  = -1;
        }
        else{
            front = (front + 1) % size;
        }
        return key;
    }
    static void display(){
        for(int i: que){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        enque(10);
        enque(4);
        enque(3);
        enque(2);
        enque(1);
        
        display();

        System.out.println(deque());
        System.out.println(deque());
        System.out.println(deque());
        System.out.println(deque());
        System.out.println(deque());
        System.out.println(deque());

    }
}
