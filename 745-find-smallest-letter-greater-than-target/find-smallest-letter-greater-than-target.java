class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int n = letters.length;
       int tar = (int)(target);
       for(int i = 0; i < n; i++){
           if((int)(letters[i]) > tar){
              return letters[i]; 
           }
       }
       return letters[0];

    }
}