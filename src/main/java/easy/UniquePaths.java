package easy;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return helper(new int[m + 1][n + 1], m, n);
    }

    private int helper(int memory[][], int m, int n) {
        if (m < 1 || n < 1) return 0;
        if (m == 1 || n == 1) return 1;
        if (memory[m][n] != 0) {
            return memory[m][n];
        }
        memory[m][n] = helper(memory, m - 1, n) + helper(memory, m, n - 1);
        return memory[m][n];
    }
}
