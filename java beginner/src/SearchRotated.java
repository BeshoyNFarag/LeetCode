
public class SearchRotated {
    public int search(int[] nums, int target) {



        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] == target) {
                return i;
            }

        }
        if (nums.length == 1) return nums[0] == target ? 0 : -1;

        return -1;
    }
}
