import java.util.LinkedList;
import java.util.Queue;
class maxAreaOfIsland {
    public int solution(int[][] grid) {
    	int width = grid.length;
    	int length = grid[0].length;
    	int[][] directions= {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	Queue<int[]> queue = new LinkedList();
    	int max = 0;
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < length; j++) {
    			if (grid[i][j] == 1) {
    				int area = 0;
    				queue.offer(new int[] {i, j});
    				while(!queue.isEmpty()) {
    					area = area + 1;
    					grid[i][j] = 2;
    					int[] temp = queue.poll();
    					for (int[] dir: directions) {
    						int x = temp[0] + dir[0];
    						int y = temp[1] + dir[1];
    						if (x >= 0 && x < width && y >= 0 && y < length && grid[x][y] == 1) {
    							queue.offer(new int[] {x, y});
    							grid[x][y] = 2;
    						}
    					}
    				}
    				max = Math.max(max, area);
    			}
    		}
    	}
    	return max;
    }

    public void printArray(int[][] arr) {
    	for (int[] i : arr ) {
    		for (int j : i) {
    			System.out.print(j + " ");
    		}
    		System.out.println(" ");
    	}
    }

    public static void main(String[] argv) {
    	int[][] example = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
    	maxAreaOfIsland obj = new maxAreaOfIsland();
    	obj.printArray(example);
    	int res = obj.solution(example);
    	System.out.println(res);
    }
}