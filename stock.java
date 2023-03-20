class Solution {
    public int maxProfit(int[] a) {

        int minsofar = a[0];
        int maxprofit = 0;

        for(int i =0;i<a.length;i++){
            minsofar = Math.min(minsofar,a[i]);
            int profit = a[i]-minsofar;
            maxprofit =Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}