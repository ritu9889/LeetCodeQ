class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //Without Binary Search
    //    int n = letters.length;
    //    int tar = (int)(target);
    //    for(int i = 0; i < n; i++){
    //        if((int)(letters[i]) > tar){
    //           return letters[i]; 
    //        }
    //    }
    //    return letters[0];

        //With Binary Search
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(start == letters.length){
            return letters[0];
        }
        return letters[start];
    }
}