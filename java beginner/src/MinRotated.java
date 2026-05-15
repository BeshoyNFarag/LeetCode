
public class MinRotated {

    public int findMin(int[] nums) {

        int min = Math.min(nums[nums.length - 1 ], nums[0]);

        for (int i = 1; i < (nums.length  - 1)  ; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[nums.length - 1 - i] < min) {
                min = nums[nums.length - 1 - i];
            }


        }

        return min;


    }
}
