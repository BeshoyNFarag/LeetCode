import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        Map<String, Integer > words = new HashMap<>();
        Set<String> bannedSet = new HashSet<>();
        String [] paragraphSplit = paragraph.split(" ");

        for(String word :banned){
            bannedSet.add(word.toLowerCase());
        }

        for(String word : paragraphSplit){
            if(words.containsKey(word)){
                words.put(word, +1);
            }
            else{
                int count = 0;
                words.put(word, 1);
            }

        }

        for(int value : words.values()){

        }
    }
}
