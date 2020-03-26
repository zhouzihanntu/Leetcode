class numRookCaptures {
    public int solution(char[][] board) {
    	int count = 0;
    	int[] dx = {-1, 1, 0, 0};
    	int[] dy = {0, 0, -1, 1};

    	for (int i = 0; i < 8; i++) {
    		for (int j = 0; j < 8; j++) {
    			if (board[i][j] == 'R') {
    				for (int k = 0; k < 4; k++) {
    					int x = i;
    					int y = j;
    					while (true) {
    						x = x + dx[k];
    						y = y + dy[k];
    						if ( x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] == 'B') {
    							break;
    						}
    						if (board[x][y] == 'p') {
    							count = count + 1;
    							break;
    						}
    					}
    				}
    				return count;
    			}
    		}
    	}
    	return count;
    }

    public static void main(String[] argv) {
    	char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
    	// char[][] arr = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
    	numRookCaptures obj = new numRookCaptures();
    	int res = obj.solution(arr);
    	System.out.println(res);
    }
}