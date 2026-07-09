class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];

        //First Binary Search for the first occurence
        int start1 = 0;
        int end1 = n - 1;
        ans[0] = -1;
        while(start1 <= end1){
            int mid = start1 + (end1 - start1)/2;
            if(nums[mid] == target){
                ans[0] = mid;
                end1 = mid - 1;
            }
            else if(nums[mid] > target){
                end1 = mid - 1;
            }
            else{
                start1 = mid + 1;
            }
        }

         //Second Binary Search for the Last occurence
        int start2 = 0;
        int end2 = n - 1;
        ans[1] = -1;
        while(start2 <= end2){
            int mid = start2 + (end2 - start2)/2;
            if(nums[mid] == target){
                ans[1] = mid;
                start2 = mid + 1;
            }
            else if(nums[mid] > target){
                end2 = mid - 1;
            }
            else{
                start2 = mid + 1;
            }
        }
        
        return ans;
    }
}