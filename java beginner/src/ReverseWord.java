public class ReverseWord {

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer(s);

        String newS = sb.reverse().toString();

        return newS;
    }
}
