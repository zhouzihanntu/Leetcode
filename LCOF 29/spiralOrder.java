class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 ) {
            return new int[]{};
        }

        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int size = (right + 1) * (bottom + 1);
        int[] res = new int[size];
        int idx = 0;
        while (idx < size) {
            for (int i = left; i <= right; i++) {
                res[idx++] = matrix[top][i];
                if(idx == size){
                    return res;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[idx++] = matrix[i][right];
                if(idx == size){
                    return res;
                }
            }
            right--;

            for (int i = right; i >= left; i--) {
                res[idx++] = matrix[bottom][i];
                if(idx == size){
                    return res;
                }
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res[idx++] = matrix[i][left];
                if(idx == size){
                    return res;
                }
            }
            left++;

        }

        return res;
    }
}