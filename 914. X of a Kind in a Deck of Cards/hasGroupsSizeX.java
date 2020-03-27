class hasGroupsSizeX {
    public boolean solution(int[] deck) {
    	int[] counter = new int[10000];
    	for (int num: deck) {
    		counter[num] = counter[num] + 1;
    	}
    	int x = 0;
    	for (int i: counter) {
    		if (i > 0) {
    			x = gcd(x, i);
    		}
    		if (x == 1) {
    			return false;
    		}
    	}
    	return true;
    }

    public int gcd(int a, int b) {
    	int mod = a % b;
    	while (mod != 0) {
    		a = b;
    		b = mod;
    		mod = a % b;
    	}
    	return b;
    }

    public static void main(String[] argv) {
    	int[] arr = {1,1,1,2,2,2,3,3};
    	hasGroupsSizeX obj = new hasGroupsSizeX();
    	boolean res = obj.solution(arr);
    	System.out.println(res);
    }
}