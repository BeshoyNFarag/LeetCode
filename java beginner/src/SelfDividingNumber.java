import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int [] numbers = new int[(right-left) + 1];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = left;
            left++;
        }

        for(int num : numbers){
            char [] characters = Character.toChars(num);
            int karmaCount = 0;
            for(char c : characters){
                if(karmaCount == characters.length){
                    list.add(num);
                }
                if(num % Character.getNumericValue(c)== 0){
                    karmaCount++;
                }
                else
                    break;

            }
        }



        return list;
    }

}
