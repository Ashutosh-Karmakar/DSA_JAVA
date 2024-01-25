public class quicksort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high){
        int pivot = high;
        int i = low-1;
        for(int j = low; j <= high ; j++){
            if(arr[j] < arr[pivot]){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    static void sort(int[] arr, int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            sort(arr, low, partition - 1 );
            sort(arr, partition + 1, high);
        }
    }
    static void displayArray(int[] arr){
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int low = 0;
        int high = arr.length - 1;
        displayArray(arr);
        sort(arr, low, high);
        displayArray(arr);
    }
}
