import java.util.*;

class maximumSumofDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        long res = 0, sum = 0;
        int left = 0, right = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while(right < nums.length) {
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(right - left + 1 > k || map.get(nums[right]) > 1) {
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            if(right - left + 1 == k) {
                res = Math.max(res, sum);
                System.out.println(left+" "+right+" "+sum);
            }
            right++;
        }
        return res;
    }
}