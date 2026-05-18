import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int missingNum = 0;
        Arrays.sort(nums);
        if(nums.length == 1 && nums[0] == 0) return 1;
        if(nums.length == 1 && nums[0] == 1) return 0;
        for(int i = 0; i < nums.length-1; i++){

            if(nums[i+1] - nums[i] == 1 && i == nums.length-2){
                return nums[i+1] + 1 ;
            }
            if( nums[i+1] - nums[i] == 1){
                continue;
            }
            if (nums[i+1] - nums[i] == 2)
                return nums[i] + 1;

            else
                 return nums[nums.length -1] + 1;


        }

        return missingNum;

    }
}
