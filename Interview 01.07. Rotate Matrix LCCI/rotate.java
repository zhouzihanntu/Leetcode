class Solution {
    public void rotate(int[][] matrix) {
    	int n = matrix.length;
        int up = 0;
        int btn = n - 1;
        while (up < btn) {
            int[] temp = matrix[up];
            matrix[up] = matrix[btn];
            matrix[btn] = temp;
            up++;
            btn--;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}