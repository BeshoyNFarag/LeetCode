import java.util.HashMap;
import java.util.Map;

class MaxLength {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.put((long) x, cnt.getOrDefault((long) x, 0) + 1);
        }

        int ans = 1;

        if (cnt.containsKey(1L)) {
            int c = cnt.get(1L);
            ans = (c % 2 == 0) ? c - 1 : c;
        }

        for (long x : cnt.keySet()) {
            if (x == 1) {
                continue;
            }
            long cur = x;
            int len = 0;
            while (cnt.getOrDefault(cur, 0) >= 2) {
                len += 2;
                if (cur > 1000000000L / cur) {
                    break;
                }
                cur *= cur;
            }
            if (cnt.getOrDefault(cur, 0) == 1) {
                len++;
            } else {
                len--;
            }
            ans = Math.max(ans, len);
        }

        return ans;
    }
}