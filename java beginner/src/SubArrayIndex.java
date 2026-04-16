public class SubArrayIndex {
    public int strStr(String haystack, String needle) {

        if (haystack == null && needle != null) return -1;

        else return haystack.indexOf(needle);
    }


    public static void main(String[] args) {
        SubArrayIndex s = new SubArrayIndex();
        System.out.println(s.strStr("", "leeto"));
    }
}
