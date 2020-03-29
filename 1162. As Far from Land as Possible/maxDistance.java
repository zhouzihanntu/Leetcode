import java.util.LinkedList;
import java.util.Queue;

class maxDistance {
    public int solution(int[][] grid) {
        int res = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList();
        int n = grid.length;
        for (int i=0; i < n; i++) {
        	for (int j=0; j < n; j++) {
        		if (grid[i][j] == 1) {
        			queue.offer(new int[] {i, j});
        		}
        	}
        }
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	res = res + 1;
        	while (size != 0) {
        		int[] temp = queue.poll();
        		for (int i=0; i<4; i++) {
        			int x = temp[0] + dx[i];
        			int y = temp[1] + dy[i];
        			if (x < 0 || x >= n || y < 0 || y >= n || grid[x][y] == 1) {
        				continue;
        			}
        			grid[x][y] = 1;
        			queue.offer(new int[] {x, y});
        		}
        		size = size - 1;
        	}
        }
        res = (res == 1) ? -1 : (res - 1);
        return res;
    }

    public static void main(String[] argv) {
        maxDistance obj = new maxDistance();
        int[][] grid = {{1,1,1},{1,1,1},{1,1,1}};
        int res = obj.solution(grid);
        System.out.println(res);
    }
}