import java.util.LinkedList;
import java.util.Queue;
class colorBorder {
    public int[][] solution(int[][] grid, int r0, int c0, int color) {
    	int width = grid.length;
    	int length = grid[0].length;
    	int oldColor = grid[r0][c0];
    	int[][] newGrid = new int[width][length];
    	for (int i=0; i< grid.length; i ++) {
    		for (int j=0; j<grid[0].length; j++) {
    			newGrid[i][j] = grid[i][j];
    		}
    	}

    	int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	boolean[][] visited = new boolean[width][length];
    	Queue<int[]> queue = new LinkedList();
    	queue.offer(new int[] {r0, c0});
    	visited[r0][c0] = true;

    	while (!queue.isEmpty()) {
    		int[] temp = queue.poll();
    		int connectCount = 0;
    		for (int[] dir: directions) {
    			int x = temp[0] + dir[0];
    			int y = temp[1] + dir[1];
    			if (x >= 0 && x < width && y >= 0 && y < length && grid[x][y] == oldColor) {
    				if (!visited[x][y]) {
    					queue.offer(new int[] {x, y});
    				}
    				connectCount = connectCount + 1;
    			}
    		}
    		visited[temp[0]][temp[1]] = true;
    		if (connectCount < 4) {
    			newGrid[temp[0]][temp[1]] = color;
    		}
    	}

    	return newGrid;
    }

    public static void main(String[] argv) {
    	int[][] grid = {{1,2,1,2,1,2},{2,2,2,2,1,2},{1,2,2,2,1,2}};
    	for (int i=0; i< grid.length; i ++) {
    		for (int j=0; j<grid[0].length; j++) {
    			System.out.print(grid[i][j] + " ");
    		}
    		System.out.println(" ");
    	}
    	int r = 1;
    	int c = 3;
    	int color = 1;
    	colorBorder obj = new colorBorder();
    	int[][] res = obj.solution(grid, r, c, color);
    	for (int i=0; i< res.length; i ++) {
    		for (int j=0; j<res[0].length; j++) {
    			System.out.print(res[i][j] + " ");
    		}
    		System.out.println(" ");
    	}
    }
}