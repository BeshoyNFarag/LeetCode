import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MaxProduct {
    public int maxProduct(int[] nums) {

        int fMax = 0;
        int sMax = 0;

        Arrays.sort(nums);

        fMax = nums[nums.length - 1];
        sMax = nums[nums.length - 2];

        return (fMax - 1) * (sMax - 1) ;
    }


    public static void main(String [] args){



    }
}
