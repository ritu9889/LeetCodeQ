class Solution {
    static boolean isValidDay(int[] bloomDay, int m, int k, int maxDay){
        int m1 = 0;
        int k1 = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= maxDay){
                k1++;
            }
            else{
                k1 = 0;
            }
            if(k1 == k){
                m1++;
                k1 = 0;
            }
        }

        if(m1 < m){
            return false;
        }
        return true;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long n = bloomDay.length;
        long a = (long) m * k;
        if(a > n){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int day : bloomDay){
        min = Math.min(min, day);
        max = Math.max(max, day);
        }
        int st = min;
        int end = max;
        int ans = 0;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(isValidDay(bloomDay, m , k, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
}