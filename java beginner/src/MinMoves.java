

public class MinMoves {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int[] diff = new int[2 * limit + 2];

        for(int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];
            int sum = a + b;
            int minSum = Math.min(a, b) + 1;
            int maxSum = Math.max(a, b) + limit;


            diff[2] += 2;
            diff[2*limit + 1] -= 2;

            diff[minSum] -= 1;
            diff[maxSum + 1] += 1;

            diff[sum] -= 1;
            diff[sum + 1] += 1;
        }

        int minMoves = n;
        int curr = 0;
        for(int target = 2; target <= 2 * limit; target++) {
            curr += diff[target];
            minMoves = Math.min(minMoves, curr);
        }

        return minMoves;
    }

    public static void main(String[] args) {
        MinMoves m = new MinMoves();
        System.out.println(m.minMoves(new int[]{1, 2, 2,1}, 2));
    }
}
