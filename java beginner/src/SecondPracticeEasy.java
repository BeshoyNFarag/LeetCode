public class SecondPracticeEasy {

    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString().equals(str);


    }
}
