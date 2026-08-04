class Solution {
    // public int maxProfit(int[] arr) {
    //     int max=0;
    //     int n=arr.length;

    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]>arr[i]){
    //                 max=Math.max(max,arr[j]-arr[i]);
    //             }
    //         }
    //     }
    //     return max;
        
    // }

    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;          // found a cheaper day to buy
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // better profit if sold today
            }
        }

        return maxProfit;
    }
}