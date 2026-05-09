public class RichestCustomer {

    public int maximumWealth(int[][] accounts) {

        int [] arr = new int[accounts.length];

        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            arr[i] = sum;
        }

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;

    }
}
