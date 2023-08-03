import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximumBeautyTest1() {
        int[] nums = {4, 6, 1, 2};
        int k = 2;
        int expected = 3;
        int actual = new Solution().maximumBeauty(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumBeautyTest2() {
        int[] nums = {1, 1, 1, 1};
        int k = 10;
        int expected = 4;
        int actual = new Solution().maximumBeauty(nums, k);

        Assert.assertEquals(expected, actual);
    }

}
