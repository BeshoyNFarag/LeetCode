import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    List<Integer> list = new ArrayList<>();
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<Integer>();
        int current = left;


        while(current <= right) {
            String str = String.valueOf(current);
            int count = 0;
            char [] numbers = str.toCharArray();
            int currentSize = numbers.length;
            for(int i = 0; i < currentSize; i++) {

                if(numbers.length == 1){
                    list.add(current);
                    current++;
                    break;
                }
                if(count == currentSize ) {
                    list.add(current);
                    current ++;
                }
                if(current % ((int) numbers[i]) == 0 && (int) numbers[i] != 0) {
                    count++;
                }

                else {
                    current++;
                    break;
                }

            }

        }




        return list;

    }
}
