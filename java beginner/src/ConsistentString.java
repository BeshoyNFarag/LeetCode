import java.util.HashSet;

public class ConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        HashSet allowedSet = new HashSet();
        for (Character c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        for(String word : words){
            char[] wordChar = word.toCharArray();
            HashSet wordSet = new HashSet();
            for(char c : wordChar){
                wordSet.add(c);
            }
            if(allowedSet.containsAll(wordSet)){
                count++;
            }

        }

        return count;
    }
}
