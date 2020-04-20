class numIslands {
    public int solution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int cnt = 0;
        int width = grid.length;
        int length = grid[0].length;
        for (int i = 0; i < width; i ++) {
            for (int j = 0; j < length; j ++) {
                if (grid[i][j] == '1') {
                    cnt ++;
                    dfs(grid, i, j);
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid, int x, int y) {
        int width = grid.length;
        int length = grid[0].length;
        if (x < 0 || x >= width || y < 0 || y >= length || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }
}