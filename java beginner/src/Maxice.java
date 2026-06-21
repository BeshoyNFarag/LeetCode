class MaxIce {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        // Counting sort frequency array
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }

        int bars = 0;

        // Buy ice cream bars from cheapest to most expensive
        for (int cost = 1; cost <= maxCost; cost++) {
            if (freq[cost] == 0) continue;

            long totalCost = (long) cost * freq[cost];

            if (coins >= totalCost) {
                coins -= totalCost;
                bars += freq[cost];
            } else {
                bars += coins / cost;
                return bars;
            }
        }

        return bars;
    }
}