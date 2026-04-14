//I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
import java.util.HashMap;


public class RomanNumbers {
    HashMap<Character, Integer> romanNumbers =  new HashMap<>();
    public  RomanNumbers() {
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

//    public int romanToInt(String s) {
//        int num = 0;
//        char [] numbers = s.toCharArray();
//        for(int i = 0; i < s.length(); i++){
//            num += romanNumbers.get(numbers[i]);
//        }
//        return num;
//    }

    public int romanToInt(String s) {

       int num = 0;
       char [] numbers = s.toCharArray();
       int size = numbers.length;

       for (int i = 0; i < size; i++) {
           if (i+ 1 != size && numbers[i] == 'I' && numbers[i+1] == 'V') {
               num += 4;
               i++;
           }
           else if (i+ 1 != size && numbers[i] == 'I' && numbers[i+1] == 'X') {
               num += 9;
               i++;
           }
           else if (i+ 1 != size && numbers[i] == 'X' && numbers[i+1] == 'L') {

               num += 40;
               i++;
           }
           else if (i+ 1 != size && numbers[i] == 'X' && numbers[i+1] == 'C') {
               num += 90;
               i++;
           }
           else if (i+ 1 != size && numbers[i] == 'C' && numbers[i+1] == 'D') {
               num += 400;
               i++;
           }
           else if (i+ 1 != size &&  numbers[i] == 'C' && numbers[i+1] == 'M') {
               num += 900;
               i++;
           }
           else
               num += romanNumbers.get(numbers[i]);
       }


        return num;
    }


    public static void main(String[] args) {
        RomanNumbers romanNumbers = new RomanNumbers();

        System.out.println(romanNumbers.romanToInt("MCMXCIV"));



    }
}
