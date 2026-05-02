import java.util.ArrayList;
import java.util.List;

public class BitWeight {

    public int hammingWeight(int n) {

        List<Integer> list = new ArrayList<>();
        int count = 0;

        while (n != 0) {
            list.add(n  % 2);
            n /= 2;
        }

        for(int num : list){
            if(num == 1)
                count ++;
        }

        return count;

    }


    public static void main(String [] args){


        BitWeight bitWeight = new BitWeight();
        System.out.println(bitWeight.hammingWeight(11));
    }
}
