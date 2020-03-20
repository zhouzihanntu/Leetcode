class islandPerimeter {
    public int solution(int[][] grid) {
    	int width = grid.length;
    	int length = grid[0].length;
    	int count = 0;
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < length; j++) {
    			if (grid[i][j] == 1) {
    				count = count + 4;
    				if (i > 0 && grid[i-1][j] == 1){
    					count = count - 2;
    				}
    				if (j > 0 && grid[i][j-1] == 1){
    					count = count - 2;
    				}
    			}
    		}
    	}
    	return count;
    }

    public static void main(String[] argv){
    	islandPerimeter obj = new islandPerimeter();
    	//int[][] arr = {{0, 1}};
    	int[][] arr = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
    	int res = obj.solution(arr);
    	System.out.println(res);
    }
}