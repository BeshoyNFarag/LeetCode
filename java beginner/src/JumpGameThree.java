import java.util.LinkedList;
import java.util.Queue;

public class JumpGameThree {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (arr[current] == 0) {
                return true;
            }

            int forward = current + arr[current];
            if (forward < n && !visited[forward]) {
                visited[forward] = true;
                queue.offer(forward);
            }


            int backward = current - arr[current];
            if (backward >= 0 && !visited[backward]) {
                visited[backward] = true;
                queue.offer(backward);
            }
        }

        return false;
    }
}
