class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        // for(int i = 1; i <= num; i++){
        //     int sq = i * i;
        //     if(sq == num){
        //         return true;
        //     }
        // }
        // return false;


        int st = 1;
        int end = num/2;
        int mid = st + (end - st)/2;
        while(st <= end){
            long a = (long)(mid);
            long sq = a * a;
            if(sq == num){
                return true;
            }
            else if(sq > num){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
            mid = st + (end - st)/2;
        }
        return false;
    }
}