public class Waiveness {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for (int num = num1; num <= num2; num++) {
            total += calculateWaviness(num);
        }
        return total;


    }

    private int calculateWaviness(int num) {

        String numStr = Integer.toString(num);


        if (numStr.length() < 3) {
            return 0;
        }

        int waviness = 0;


        for (int i = 1; i < numStr.length() - 1; i++) {
            int current = numStr.charAt(i) - '0';
            int left = numStr.charAt(i - 1) - '0';
            int right = numStr.charAt(i + 1) - '0';


            if (current > left && current > right) {
                waviness++;
            }

            else if (current < left && current < right) {
                waviness++;
            }
        }

        return waviness;
    }

}
