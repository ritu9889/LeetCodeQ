class Solution {
     static boolean isValidSum(int[] nums, int k, int maxSum){
        int a = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
           if(sum + nums[i] > maxSum){
            a++;
            sum = 0;
            if(a > k || nums[i] > maxSum){
                return false;
            }
           }
           sum += nums[i];
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int start = 0;
        int end = sum;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidSum(nums, k , mid)){
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