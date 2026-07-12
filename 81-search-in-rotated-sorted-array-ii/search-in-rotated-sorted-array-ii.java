class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                break;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[start] <= nums[mid]){
                //Left is sorted
                if(target >= nums[start] && target < nums[mid]){
                    ans = mid;
                    end = mid - 1;
                }              
                else{
                    start = mid + 1;
                }
            }

            else{
                //Right is Sorted
                if(target > nums[mid] && target <= nums[end]){
                    ans = mid;
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        if(nums[ans] == target){
            return true;
        }
        return false;
    }
}