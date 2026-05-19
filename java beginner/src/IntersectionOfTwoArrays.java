import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int num: nums1){
            list1.add(num);
        }

        for(int num: nums2){
            if(list1.contains(num)){
                int i = list1.indexOf(num);
                intersection.add(num);
                list1.remove(i);

            }
        }



        return intersection.stream().mapToInt(i -> i).toArray();
    }
}
