class myAtoi {
    public int solution(String str) {
    	char[] chars = str.toCharArray();
    	int idx = 0;
    	while (idx < chars.length && chars[idx] == ' ') {
    		idx ++;
    	}
    	if (idx == chars.length) {
    		return 0;
    	}
    	boolean neg = false;
    	if (chars[idx] == '-') {
    		neg = true;
    		idx ++;
    	}
    	else if (chars[idx] == '+') {
    		idx ++;
    	}
    	else if ((chars[idx] - '0') < 0 && (chars[idx] - '0') > 9) {
    		return 0;
    	}
    	int num = 0;
    	while(idx < chars.length && (chars[idx] - '0') >= 0 && (chars[idx] - '0') <= 9) {
    		int n = chars[idx] - '0';
    		if (num > (Integer.MAX_VALUE - n) / 10) {
    			return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    		}
    		num = num * 10 + n;
    		idx ++;
    	}
    	return neg ? -num : num;

    }

    public static void main(String[] argv) {
    	String str = "   -42";
    	myAtoi obj = new myAtoi();
    	int res = obj.solution(str);
    	System.out.println(res);
    }
}