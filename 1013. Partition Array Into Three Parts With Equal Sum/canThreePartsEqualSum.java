public class canThreePartsEqualSum {
    public boolean solution(int[] A) {
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
    		sum = sum + A[i];
    	}
    	if (sum % 3 != 0) {
    		return false;
    	}
    	int avg = sum / 3;
    	int sum1 = 0;
    	int count = 0;
    	for (int i = 0; i < A.length -1; i++) {
    		sum1 = sum1 + A[i];
    		if (sum1 == avg) {
    			count = count + 1;
    			if (count == 2) {
    				return true;
    			}
    			sum1 = 0;
    		}
    	}
    	return false;
    }
    public static void main(String[] argvs){
    	canThreePartsEqualSum tool = new canThreePartsEqualSum();
    	//int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
    	int[] A = {1,-1,1,-1};
    	boolean res = tool.solution(A);
    	System.out.println(res);
    }
}