import java.util.ArrayList;

public class SeparateDigitsArray {

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: nums){
            char [] numArr = Integer.toString(num).toCharArray();
            for(char ch: numArr){
                arr.add(Integer.parseInt(String.valueOf(ch)));
            }
        }
        int [] ans = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
