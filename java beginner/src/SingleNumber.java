import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }
}
