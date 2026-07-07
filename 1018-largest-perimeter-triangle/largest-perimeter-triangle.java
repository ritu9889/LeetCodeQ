class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxPerimeter = Integer.MIN_VALUE;
        int perimeter = 0;
        int i = 0;
        int j = i + 2;
        while(j < n){
            int val = nums[i] + nums[i + 1];
            if(val > nums[j]){
                perimeter = val + nums[j];
            }
            if(perimeter > maxPerimeter){
                maxPerimeter = perimeter;
            }
            
            if(j == n - 1 && maxPerimeter < 0){
                return 0;
            }
            i++;
            j++;
        }
        return maxPerimeter;
    }
}