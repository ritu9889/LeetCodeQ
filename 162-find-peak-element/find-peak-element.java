class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return n - 1;
        }
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == n - 1){
                return mid;
            }
            if(nums[mid] > nums[mid + 1]){
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