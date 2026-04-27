import java.util.List;

public class CommonCharacters {
    public List<String> commonChars(String[] words) {

        char [] characters = words[0].toCharArray();
        

        int count = 1;
        int i = 0;

        while(words[i].indexOf(characters[i]) != -1 ){

            count ++;
        }


    }
}
