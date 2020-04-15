class updateMatrix {
    public int[][] solution(int[][] matrix) {
        int width = matrix.length;
        int length = matrix[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < width; i ++) {
            for (int j = 0; j < length; j ++) {
                if (matrix[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
                else {
                    matrix[i][j] = -1;
                }
            }
        }
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            for (int[] d: direction) {
                int x = temp[0] + d[0];
                int y = temp[1] + d[1];
                if (x >= 0 && x < width && y >= 0 && y < length && matrix[x][y] == -1) {
                    matrix[x][y] = matrix[temp[0]][temp[1]] + 1;
                    q.offer(new int[] {x, y});
                }
            }
        }

        return matrix;
    }
}