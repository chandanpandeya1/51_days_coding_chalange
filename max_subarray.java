public class max_subarray {
    public static void main(String[] args) {
        int arr[] = { 5, -4, -2, 6, 1 };

        int maxsum = 0;
        int cursum = 0;

        for (int i = 0; i < arr.length; i++) {

            cursum = cursum + arr[i];
            if(cursum>maxsum){
                maxsum=cursum;

            }
            if(cursum<0){

                cursum=0;
            }
        }
       System.out.println(maxsum);
    }

}
