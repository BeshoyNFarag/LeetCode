import java.util.TreeSet;

public class LargestTriangle {
    public int largestPerimeter(int[] nums) {


        if (nums.length == 0) return 0;
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }





    }
}
