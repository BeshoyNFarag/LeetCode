import java.util.*;

class MaxBuildHeight {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        int[][] arr = new int[m + 2][2];
        arr[0][0] = 1;
        arr[0][1] = 0;

        for (int i = 0; i < m; i++) {
            arr[i + 1] = restrictions[i];
        }

        arr[m + 1][0] = n;
        arr[m + 1][1] = n - 1;

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int k = arr.length;

        for (int i = 1; i < k; i++) {
            arr[i][1] = Math.min(arr[i][1], arr[i - 1][1] + (arr[i][0] - arr[i - 1][0]));
        }

        for (int i = k - 2; i >= 0; i--) {
            arr[i][1] = Math.min(arr[i][1], arr[i + 1][1] + (arr[i + 1][0] - arr[i][0]));
        }

        long ans = 0;

        for (int i = 1; i < k; i++) {
            long d = arr[i][0] - arr[i - 1][0];
            long h1 = arr[i - 1][1];
            long h2 = arr[i][1];
            ans = Math.max(ans, (h1 + h2 + d) / 2);
        }

        return (int) ans;
    }
}