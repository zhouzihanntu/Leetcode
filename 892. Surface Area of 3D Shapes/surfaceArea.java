class surfaceArea {
    public int solution(int[][] grid) {
        int n = grid.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    int num = grid[i][j];
                    count = count + num * 4 + 2;
                    if (i > 0 && grid[i-1][j] > 0){
                        count = (num < grid[i-1][j]) ? (count - 2 * num) : (count - 2 * grid[i-1][j]);
                    }
                    if (j > 0 && grid[i][j-1] > 0){
                        count = (num < grid[i][j-1]) ? (count - 2 * num) : (count - 2 * grid[i][j-1]);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] argv){
        surfaceArea obj = new surfaceArea();
        int[][] arr = {{2,2,2},{2,1,2},{2,2,2}};
        int res = obj.solution(arr);
        System.out.println(res);
    }
}