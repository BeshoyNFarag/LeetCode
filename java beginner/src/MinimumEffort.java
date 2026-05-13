import java.util.Arrays;

public class MinimumEffort {

    public int minimumEffort(int[][] tasks) {




                Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

                int energy = 0;
                int initial = 0;

                for (int[] task : tasks) {
                    if (energy < task[1]) {
                        initial += task[1] - energy;
                        energy = task[1];
                    }
                    energy -= task[0];
                }

                return initial;

    }
}
