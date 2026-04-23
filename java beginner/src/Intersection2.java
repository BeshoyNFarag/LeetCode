import java.util.ArrayList;
import java.util.HashSet;

public class Intersection2 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                list1.add(num);
            }
        }


        return list1.stream().mapToInt(i->i).toArray();
    }
}
