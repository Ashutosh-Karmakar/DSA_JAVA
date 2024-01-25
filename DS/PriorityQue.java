package DS;

import java.util.Collections;
import java.util.Vector;

import JavaCollections.collections;

class Items {
    public String value;
    public int priority;
    Items(String v, int p){
        value = v;
        priority = p;
    }
}

public class PriorityQue {
    static Vector<Items> pr = new Vector<>();
    static int size;

    static int parent(int i){
        return (i-1)/2;
    }
    static int left(int i){
        return i*2 + 1;
    }
    static int right(int i){
        return i*2 + 2;
    }

    static void insert(Items key){
        pr.add(key);
        size ++;
        int i = size -1;
        while(i != 0 && pr.get(i).priority > pr.get(parent(i)).priority){
            System.err.println("eh");
            Collections.swap(pr, i, parent(i));
            i = parent(i);
        }
    }

    static void heapify(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;
        if(left < size && pr.get(left).priority > pr.get(largest).priority){
            largest = left;
        }
        if(right < size && pr.get(right).priority > pr.get(largest).priority){
            largest = right;
        }
        if(largest != i){
            Collections.swap(pr, i, largest);
            heapify(largest);
        }
    }

    static Items extractMax(){
        if(size <= 0){
            System.err.println("The que is empty");
            return null;
        }
        if(size == 1){
            return pr.get(--size);
        }
        Items top = pr.get(0);
        Collections.swap(pr, size-1, 0);
        size --;
        heapify(0);
        return top;
    }
    static void display(){
        for(int i=0; i<size ; i++){
            System.out.println(pr.get(i).value + " - " + pr.get(i).priority);
        }
    }
    public static void main (String args[]){
        size = 0;
        insert(new Items("ashu", 1));
        insert(new Items("Tosh", 2));
        insert(new Items("Karmakar", 3));
        
        

        System.out.println(size);
        display();
        System.out.println("First priority : " + extractMax().value);
        System.out.println("Second priority : " + extractMax().value);
        System.out.println("Thrid priority : " + extractMax().value);
        
    }
}
