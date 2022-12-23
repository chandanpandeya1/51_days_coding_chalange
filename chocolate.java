import java.util.*;

public class chocolate {
    public static int find (int[]arr ,int n,int m) {


        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=0;i<n-m;i++){
            int minw=arr[i];
            int maxw=arr[i+m-1];
            int gap = maxw-minw;

            if(gap<ans){
                ans=gap;

            }

        }

        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr =new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int m =sc.nextInt();
        int ans =find(arr, n, m);
        System.out.println(ans);
    }
    


}
