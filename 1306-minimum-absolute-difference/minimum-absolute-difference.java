class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        int j = i + 1;
        int min = 0;
        int minimum = Integer.MAX_VALUE;
        while(j < n){
            min = Math.abs(arr[i] - arr[j]);
            if(minimum > min){
                minimum = min;
            }
            i++;
            j++;
        }

        int k = 0;
        int r = k + 1;
        List<List<Integer>> result = new ArrayList<>();
        while(r < n){
            min = Math.abs(arr[k] - arr[r]);
            if(min == minimum){
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[k]);
                ans.add(arr[r]);
                result.add(ans);
            }
            k++;
            r++;
        }

        return result;
    }
}