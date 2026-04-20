import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> treeSt = new TreeSet<>();

        for (int num : nums) {
            treeSt.add(num);
        }
        Iterator<Integer> it = treeSt.iterator();
        int k = treeSt.size();
        for(int i = 0; i < k; i++){
            nums[i] = it.next();
        }

        return k;
    }


    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }
}
