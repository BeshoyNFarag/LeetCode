public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int counter = 0;
        if (ransomNote.length() > magazine.length()) return false;



        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();


        for (int i = 0; i < ransomNoteArray.length; i++) {


            for (int j = 0; j < magazineArray.length; j++) {

                if (ransomNoteArray[i] == magazineArray[j]) {
                    magazineArray[j] = '-';
                    ransomNoteArray[i] ='_';

                    counter++;
                }
            }


        }


        return counter >= ransomNoteArray.length;
    }

    public static void main(String[] args) {
        RansomNote r = new RansomNote();
        System.out.println(r.canConstruct("aa", "aab"));
    }
}
