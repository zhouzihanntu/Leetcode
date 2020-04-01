class maxDepthAfterSplit {
    public int[] solution(String seq) {
    	int[] res = new int[seq.length()];
    	for (int i = 1; i < res.length; i++) {
    		if (seq.charAt(i) == seq.charAt(i-1)) {
    			res[i] = 1 - res[i - 1];
    		}
    		else {
    			res[i] = res[i - 1];
    		}
    	}
    	return res;
    }

    public static void main(String[] argv) {
    	String str = "()(())()";
    	maxDepthAfterSplit obj = new maxDepthAfterSplit();
    	int[] res = obj.solution(str);
    	for (int i : res) {
    		System.out.print(i + " ");
    	}
    	System.out.println(" ");
    }
}