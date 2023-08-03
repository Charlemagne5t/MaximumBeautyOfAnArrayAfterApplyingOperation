import java.util.Arrays;

public class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int maxLength = 1;

        int left = 0;
        int right = 0;

        while (right < nums.length){
            if(nums[right] - nums[left] <= k * 2){
                maxLength = Math.max(right - left + 1, maxLength);
                right++;
            }else {
                left++;
            }
        }

        return maxLength;
    }

}
