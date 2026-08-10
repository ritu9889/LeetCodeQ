class Solution {
    static boolean isValidDivisor(int[] nums, int threshold, int divisor){
        double sumOfResults = 0;
        double r = (double)divisor;
        for(int num : nums){
            double Quotient = Math.ceil(num / r);
            sumOfResults += Quotient;
        }
        return (int)sumOfResults <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int maxi = -1;
        for(int num : nums){
            maxi = Math.max(maxi, num);
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