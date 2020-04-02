class gameOfLife {
    public void solution(int[][] board) {
    	if (board.length == 0) {
    		return;
    	}
    	int width = board.length;
    	int length = board[0].length;
    	int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < length; j++) {
    			int count = 0;
    			for (int k = 0; k < 8; k++) {
    				int x = i + directions[k][0];
    				int y = j + directions[k][1];
    				if (x < 0 || x >= width || y < 0 || y >= length) {
    					continue;
    				}
    				count = count + (board[x][y] & 1);
    			}
    			if ( (board[i][j] & 1) > 0) {
    				if (count >= 2 && count <= 3) {
    					board[i][j] = 0b11;
    				}
    			}
    			else if (count == 3) {
    				board[i][j] = 0b10;
    			}
    		}
    	}
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < length; j++) {
    			board[i][j] >>= 1;
    		}
    	}

    	printArry(board);
    }

    public void printArry(int[][] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[0].length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println(" ");
    	}
    }

    public static void main(String[] argv) {
    	int[][] arr = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
    	gameOfLife obj = new gameOfLife();
    	obj.printArry(arr);
    	obj.solution(arr);
    }
}