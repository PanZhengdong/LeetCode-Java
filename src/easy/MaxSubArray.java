package easy;

public class MaxSubArray {
	public int maxSubArray(int[] A) {
		int n = A.length;
		int[] dp = new int[n];
		dp[0] = A[0];
		int max = dp[0];

		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(A[i] + dp[i - 1], A[i]);
			max = Math.max(max, dp[i]);

		}
		return max;
	}
}
