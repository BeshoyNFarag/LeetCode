import java.util.ArrayList;
import java.util.Collections;

public class ReverseWord {

    public String reverseWords(String s) {
        ArrayList<String> str = new ArrayList<>();
        String result = "";
        Collections.addAll(str, s.split(" "));

        for (int i = 0; i < str.size(); i++) {
            StringBuffer sb = new StringBuffer(str.get(i));
            if (i== str.size() - 1)
                result += sb.reverse();

            else
                result += sb.reverse()+ " ";


        }
//        for(String word : str){
//            StringBuffer sb = new StringBuffer(word);
//            result = result.concat(sb.reverse().toString()) ;
//        }

        return result;
    }
}
