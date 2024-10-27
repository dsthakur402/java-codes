public class HeapSort {
    public static void heapifyAsc(int[] arr, int i , int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;
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
            heapifyAsc(arr, maxIdx, n);
        }
    }
    public static void heapifyDesc(int[] arr, int i , int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;
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
            heapifyDesc(arr, minIdx, n);
        }
    }
    public static void heapSortAsc(int[] arr){
        // step-1 build MaxHeap
        int n = arr.length;
        for(int i = n/2-1; i >= 0; i--){
            heapifyAsc(arr, i, n);
        }

        // step-2 push largest at end
        for(int i = n-1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapifyAsc(arr, 0, i);
        }
    }
    public static void heapSortDesc(int[] arr){
        // step-1 build MinHeap
        int n = arr.length;
        for(int i = n/2-1; i >= 0; i--){
            heapifyDesc(arr, i, n);
        }

        // step-2 push smallest at end
        for(int i = n-1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapifyDesc(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        heapSortAsc(arr);
        System.out.print("ascendig order: ");
        for(int n : arr){
            System.out.print(n + " ");
        }


        heapSortDesc(arr);
        System.out.println();
        System.out.print("descending order: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
