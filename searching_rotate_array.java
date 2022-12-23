import java.util.*;


public class searching_rotate_array {

    public int find(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (arr[0] <= arr[mid]) {
                if (target >= arr[lo] && arr[mid] > target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;

                }
            }

            else if (arr[mid] <= arr[hi]) {
                if (target >= arr[mid] && target < arr[hi]) {
                    lo = mid + 1;

                } else {
                    hi = mid - 1;

                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr =new int[n];

        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int target =sc.nextInt();
        int ans =find(arr, target);
        System.out.println(ans);
    }
    

}
