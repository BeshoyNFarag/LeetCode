

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int numOfZeros = digits.length - 1;
        int number = 0;


        for(int i = 0 ; i < digits.length; i++){
            number = number +( (int) (digits[i] * (Math.pow(10,numOfZeros))));
            numOfZeros --;
        }
        number +=1;

        int[] arr = new int[String.valueOf(number).length()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }


        return arr;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int [] digits = {9,8,7,6,5,4,3,2,1,0};
        //int [] result = plusOne.plusOne(digits);
//        for(int i = 0 ; i < result.length ; i++){
//            System.out.print(result[i] + " ");
//        }
//        System.out.println(result.length);

//        System.out.println(plusOne.plusOne(digits));
    }
}
