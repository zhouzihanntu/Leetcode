class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int width = grid.length;
        int length = grid[0].length;
        int cnt = 0;
        for (int r = 0; r < width; ++r) {
            for (int c = 0; c < length; ++c) {
                if (grid[r][c] == '1') {
                    ++cnt;
                    dfs(grid, r, c);
                }
            }
        }

        return cnt;
    }

    public void dfs(char[][] grid, int r, int c) {
        int width = grid.length;
        int length = grid[0].length;

        if (r < 0 || c < 0 || r >= width || c >= length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}