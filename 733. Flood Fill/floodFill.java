class floodFill {
    public int[][] solution(int[][] image, int sr, int sc, int newColor) {
    	int oldColor = image[sr][sc];
    	dfs(image, sr, sc, newColor, oldColor);
    	return image;
    }

    public void dfs(int[][] image, int i, int j, int newColor, int oldColor) {
    	if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] == newColor || image[i][j] != oldColor) {
    		return;
    	}
    	else {
    		image[i][j] = newColor;
    		dfs(image, i-1, j, newColor, oldColor);
    		dfs(image, i+1, j, newColor, oldColor);
    		dfs(image, i, j-1, newColor, oldColor);
    		dfs(image, i, j+1, newColor, oldColor);
    	}
    }

    public static void main(String[] argv) {
    	floodFill obj = new floodFill();
    	int[][] img = {{1,1,1},{1,1,0},{1,0,1}};
    	int r = 1, c = 1, nColor = 2;
    	int[][] res = obj.solution(img, r, c, nColor);
    	for (int i=0; i < res.length; i++) {
    		for (int j=0; j < res[0].length; j++) {
    			System.out.print(res[i][j] + " ");
    		}
    		System.out.println(" ");
    	}
    }
}