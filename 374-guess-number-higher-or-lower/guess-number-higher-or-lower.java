/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        int mid = 0, a = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            a = guess(mid);
            if(a == 0){
                return mid;
            }
            else if(a < 0){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return 0;
    }
}