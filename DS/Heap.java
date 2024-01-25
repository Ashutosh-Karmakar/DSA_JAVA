package DS;

import java.util.*;

import JavaCollections.collections;

public class Heap {
    static Vector<Integer> heap;
    static int hs = 0;
    
    //need to be a complete binary tree
    static int parent(int i){
        return (i-1)/2;
    }
    static int left(int i){
        return i*2 + 1;
    }
    static int right(int i){
        return i*2 + 2;
    }
    static void insert(int k){
        hs++;
        heap.add(k);
        int size = hs-1;
        while(size > 0){
            int parent = parent(size);
            if(heap.get(parent) < heap.get(size)){
                Collections.swap(heap, size, parent);
                size = parent;
            }
            else{
                return;
            }
        }
    }
    static int delete(){
        int top = heap.get(0);
        System.out.println(heap.get(hs-1));
        Collections.swap(heap, 0, hs-1);
        System.out.println(heap.get(hs-1));
        hs--;
        System.out.println(heap.get(hs-1));

        int i = 0;
        while(i<hs){
            int left = left(i);
            int right = right(i);
            int largest = i;
            if(left < hs && heap.get(left) > heap.get(largest)){
                largest = left;
            }
            if(right < hs && heap.get(right) > heap.get(largest)){
                largest = right;
            }
            if(largest != i){
                Collections.swap(heap, largest, i);
                i = largest;
            }
            else{
                break;
            }
        }
        return top;
    }

    static void displayHeap(){
        System.out.println();
        for(int i=0;i<hs;i++){
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size - " + hs);
    }
    public static void main(String args[]) {
        heap = new Vector<Integer>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(45);
        heap.add(5);
        heap.add(20);
        heap.add(30);
        heap.add(10);

        hs = heap.size();
        
        displayHeap();

        insert(70);
        displayHeap();

        System.out.println("After deletion - " + delete());

        displayHeap();
    }
}
