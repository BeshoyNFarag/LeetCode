public class ReverseCharArray {

    public void reverseString(char[] s) {

        String str = String.valueOf(s);

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();
        s = str.toCharArray();
        System.out.println(s);
    }



    public static void main(String[] args) {
        ReverseCharArray r = new ReverseCharArray();
        r.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
