class Solution {
    static boolean isValidForce(int[] position, int balls, int minForce){
        int n = position.length;
        int countBall = 1;
        int currBallPos = 0;
        for(int i = 1; i < n; i++){
            if(Math.abs(position[i] - position[currBallPos]) >= minForce){
                countBall++;
                currBallPos = i;
                if(countBall == balls){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int start = 1;
        int end = position[n-1] - position[0];
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidForce(position, m, mid)){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}