public class heapSortMaxHeap {

    public static void maxHeapify(int[] arr, int n, int i){
        int maxIdx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < n && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    public static void heapSort(int[] arr){
        // step -1 build maxHeap
        int n = arr.length;
        for(int i = n/2 - 1; i >= 0; i--){
            maxHeapify(arr, n, i);
        }

        // step - 2 push largest at end
        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
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
