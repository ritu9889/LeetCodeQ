class Solution {
    static boolean isValidWeight(int[] weights, int days, int maxWeight){
        int day = 1;
        int weight = 0;
        for(int i = 0; i < weights.length; i++){
           if(weight + weights[i] > maxWeight){
            day++;
            weight = 0;
            if(day > days || weights[i] > maxWeight){
                return false;
            }
           }
           weight += weights[i];
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int i = 0; i < weights.length;i++){
            sum += weights[i];
        }

        int start = 0;
        int end = sum;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidWeight(weights, days, mid)){
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