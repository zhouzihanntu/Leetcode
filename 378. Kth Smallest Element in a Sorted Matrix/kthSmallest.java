class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (countSmallerThanMid(matrix, mid) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int countSmallerThanMid(int[][] matrix, int mid) {
        int n = matrix.length;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; (j < n) && (matrix[i][j] <= mid); j++) {
                count++;
            }
        }
        return count;
    }
}