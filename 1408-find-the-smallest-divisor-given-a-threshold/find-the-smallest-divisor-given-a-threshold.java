class Solution {
    static boolean isValidDivisor(int[] nums, int threshold, int divisor){
        int sumOfResults = 0;
        double r = (double)divisor;
        for(int i = 0; i < nums.length; i++){
            double Quotient = Math.ceil(nums[i] / r);
            sumOfResults += Quotient;
        }
        return sumOfResults <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int maxi = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        int end = maxi;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidDivisor(nums, threshold, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}