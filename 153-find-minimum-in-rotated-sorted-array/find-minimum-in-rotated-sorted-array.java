class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = 0;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid == n - 1){
                return nums[0];
            }
            if(nums[start] <= nums[mid]){
                //Left part is sorted
                if(nums[mid] >= nums[mid + 1]){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                //Right part is sorted
                if(nums[start] >= nums[end]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return nums[ans + 1];
    }
}