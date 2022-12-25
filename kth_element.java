import java.util.Arrays;
import java.util.*;

public class kth_element {
    public static void main(String[] args) {

        // using normal ;

        int arr[] = { 6, 2, 5, 1, 4, 8, 7 };
        int k = 4;
        // Arrays.sort(arr);
        // System.out.println(arr[k-1]);

        
    }
}

// using heap sort



class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
