class Solution {
    static boolean isValidAnswer(int[] arr, int hours, int speed){
        int h = 0;
        int i = 0;
        int val = 0;
        while(i < arr.length){
            int a = arr[i]/speed;
            if(arr[i] % speed == 0){
                h = h + a;
            }
            else{
                h = h + (a + 1);
            }
            if(h > hours){
                return false;
            }
            i++;
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int maxVal = -1;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] >= maxVal){
                maxVal = piles[i];
            }
        }
        int end = maxVal;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidAnswer(piles, h, mid)){
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