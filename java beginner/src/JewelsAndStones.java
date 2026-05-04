import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count= 0;
        Set<Character> jewelSet= new HashSet<>();
        for(char c: jewels.toCharArray()){
            jewelSet.add(c);
        }

        for(char stone:stones.toCharArray() ){
            if(jewelSet.contains(stone)){
                count++;
            }
        }


        return count;
    }
}
