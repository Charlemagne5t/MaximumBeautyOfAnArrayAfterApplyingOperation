import java.util.Arrays;

class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 1;

        int start = 0;
        int end = 0;
        for(; end < nums.length; end++) {
            while(start < end && nums[start] + 2 * k < nums[end]) {
                start++;
            }

            res = Math.max(res, end - start + 1);
        }
        return res;
    }
}
