import java.util.Arrays;

public class GoodArray {

    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length - 1];

        if (nums.length != n + 1) return false;


        if (nums[nums.length - 1] != n || nums[nums.length - 2] != n) return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != i + 1) return false;
        }

        return true;
    }
}
