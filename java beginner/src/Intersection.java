import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> list1 = new HashSet<>();

        for(int num1 : nums1){
            for(int num2 : nums2){
                if(num1 == num2 && !list1.contains(num2)){
                    list1.add(num2);
                    break;
                }
            }
        }




        return list1.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] nums1 = {1,2,3,4,5,6,7};
        int[] nums2 = {2,2};
        int[] result = intersection.intersection(nums1, nums2);
        for(int num : result){
            System.out.println(num);
        }
    }
}
