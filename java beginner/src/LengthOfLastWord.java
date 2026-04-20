//Given a string s consisting of words and spaces,
// return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String trimmed = s.trim();
        int lIndex = trimmed.length() - trimmed.lastIndexOf(" ") - 1 ;

        return lIndex;

    }


    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord("luffy is still joyboy"));
    }

}
