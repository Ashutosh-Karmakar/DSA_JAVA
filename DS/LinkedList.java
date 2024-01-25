package DS;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static LinkedList insert(int n, LinkedList list){
        
        Node newNode = new Node(n);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    static void printList(LinkedList list){
        Node start = list.head;
        while(start != null){
            System.out.print(start.data + "->");
            start = start.next;
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list = insert(10, list);
        list = insert(11, list);
        list = insert(12, list);

        printList(list);

    }

}
