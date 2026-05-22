import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = Math.max(m,n);
        for(int i = 0; i < max; i++){
            if(nums1[i] > nums2[i]){
                arrayList.add(nums2[i]);
                arrayList.add(nums1[i]);
            }
            else{
                arrayList.add(nums1[i]);
                arrayList.add(nums2[i]);
            }
        }

         arrayList;
    }
}
