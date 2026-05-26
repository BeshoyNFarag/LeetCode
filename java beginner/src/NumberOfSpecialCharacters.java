import java.util.HashSet;
import java.lang.Character;

public class NumberOfSpecialCharacters {
    public int numberOfSpecialChars(String word) {
        char [] characters =  word.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0;


        for(char character : characters){
            if(Character.isUpperCase(character)){
                set.add(character);
            }
        }

        for(char character : characters){
            if(Character.isLowerCase(character) && set.contains(Character.toUpperCase(character))){
                set.remove(Character.toUpperCase(character));
                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        NumberOfSpecialCharacters obj = new NumberOfSpecialCharacters();
        obj.numberOfSpecialChars("abcd");

    }
}
