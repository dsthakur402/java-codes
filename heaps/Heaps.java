import java.util.ArrayList;

public class Heaps {
    static class Heap {
        public static ArrayList<Integer> arr = new ArrayList<>();

        // Adds a new element to the heap and maintains the Min-Heap property
        public static void add(int data) {
            arr.add(data); // Add the new element at the end
            int x = arr.size() - 1; // Index of the newly added element
            int par = (x - 1) / 2; // Index of its parent
            
            // Bubble up: swap with the parent while the Min-Heap property is violated
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                // Move up to the next parent
                x = par;
                par = (x - 1) / 2;
            }
        }

        // Returns the minimum element (the root of the heap)
        public static int peek() {
            return arr.get(0); // Root element is the minimum
        }

        // Heapify the subtree rooted at index `i` to maintain the Min-Heap property
        private static void heapify(int i) {
            int left = 2 * i + 1; // Left child index
            int right = 2 * i + 2; // Right child index
            int min = i; // Initialize `min` as the current node

            // Find the smallest among root, left child, and right child
            if (left < arr.size() && arr.get(left) < arr.get(min)) {
                min = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(min)) {
                min = right;
            }

            // If the smallest is not the root, swap and continue heapifying
            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
                heapify(min); // Recursively heapify the affected subtree
            }
        }

        // Removes the minimum element (root) and reheapifies
        public static void remove() {
            // Replace root with the last element
            arr.set(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1); // Remove the last element
            heapify(0); // Heapify from the root to maintain Min-Heap
        }

        // Checks if the heap is empty
        public static boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(20);
        h.add(5);
        h.add(7);
        h.add(53);
        h.add(53);
        h.add(1);

        // Print all elements in sorted order
        while (!h.isEmpty()) {
            System.out.println(h.peek()); // Print the minimum element
            h.remove(); // Remove the minimum element
        }
    }
}
