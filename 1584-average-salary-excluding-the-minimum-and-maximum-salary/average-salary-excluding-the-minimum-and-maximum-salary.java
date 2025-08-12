class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : salary) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Remove min and max from sum
        sum -= max;
        sum -= min;

        // Return average excluding min and max
        return (double) sum / (salary.length - 2);
    }
}
