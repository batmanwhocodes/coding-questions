class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int N = nums.length, length = 0;
        int[] res = new int[N - k + 1];
        for(int i = 0; i < N; i++) {
            if(i == 0 || nums[i] == nums[i - 1] + 1) {
                length++;
            } else {
                length = 1;
            }
            if(i - k + 1 >= 0) {
                if(length == k) {
                    res[i - k + 1] = nums[i];
                    length--;
                } 
                else res[i - k + 1] = -1;
            }
        }
        return res;
    }
}