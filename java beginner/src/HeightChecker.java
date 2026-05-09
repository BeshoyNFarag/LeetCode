import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int n = heights.length;
        int [] sortedInt = heights.clone();
        int count = 0;
        Arrays.sort(sortedInt);

        for(int i = 0 ; i < n ; i++){
            if(heights[i] != sortedInt[i]){
                count ++;
            }
        }

        return count;
    }
}
