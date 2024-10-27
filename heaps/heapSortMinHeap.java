public class heapSortMinHeap {

    public static void minHeapify(int[] arr, int n, int i){
        int minIdx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr[left] < arr[minIdx]){
            minIdx = left;
        }
        if(right < n && arr[right] < arr[minIdx]){
            minIdx = right;
        }
        if(minIdx != i){
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void heapSort(int[] arr){
        // step -1 build minHeap
        int n = arr.length;
        for(int i = n/2 - 1; i >= 0; i--){
            minHeapify(arr, n, i);
        }

        // step - 2 push smallest at end
        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            minHeapify(arr, i, 0);
        } 

    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        heapSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
