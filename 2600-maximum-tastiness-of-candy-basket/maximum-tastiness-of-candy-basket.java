class Solution {
    static boolean isValidTaste(int[] price, int k, int taste){
        int countCandy = 1;
        int candyPos = 0;
        for(int i = 1; i < price.length; i++){
            if(Math.abs(price[i] - price[candyPos]) >= taste){
                countCandy++;
                candyPos = i;
                // if(countCandy == k){
                //     return true;
                // }
            }
        }
        return countCandy >= k;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;

        int start = 0;
        int end = price[n-1] - price[0];
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidTaste(price,k,mid)){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1; 
            }
        }
        return ans;
    }
}