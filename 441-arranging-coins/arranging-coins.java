class Solution {
    public int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            long k = (long)(mid);
            long val = (k * (k + 1)) / 2;
            if(val <= n){
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