class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        int j = i + 1;
        int min = 0;
        int minimum = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        while(j < n){
            min = Math.abs(arr[i] - arr[j]);
           if(minimum > min){
            minimum = min;
            result.clear();
              List<Integer> ans = new ArrayList<>();
              ans.add(arr[i]);
              ans.add(arr[j]);
              result.add(ans);
           }
           else if( minimum == min ){
             List<Integer> ans1 = new ArrayList<>();
              ans1.add(arr[i]);
              ans1.add(arr[j]);
              result.add(ans1);
           }
           i++;
           j++;
        }
        return result;
    }
}