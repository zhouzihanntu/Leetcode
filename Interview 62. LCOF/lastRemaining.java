class lastRemaining {
    public int solution(int n, int m) {
    	int p = 0;
    	for (int i = 2; i < n + 1; i++) {
    		p = (p + m) % i;
    	}
    	return p;
    }

    public static void main(String[] argv) {
    	int n = 5;
    	int m = 3;
    	lastRemaining obj = new lastRemaining();
    	int res = obj.solution(n, m);
    	System.out.println(res);
    }
}