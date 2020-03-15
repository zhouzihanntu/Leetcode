class isAnagram {
    public boolean solution(String s, String t) {
    	int[] arr = new int[26];
    	char[] str1 = s.toCharArray();
    	char[] str2 = t.toCharArray();
    	int index = -1;
    	if (str1.length != str2.length) {
    		return false;
    	}
    	for (int i = 0; i < str1.length; i++ ){
    		index = str1[i] - 'a';
    		arr[index] = arr[index] + 1;
    	}
    	for (int i = 0; i < str2.length; i++ ){
    		index = str2[i] - 'a';
    		arr[index] = arr[index] - 1;
    	}
    	for (int i = 0; i < arr.length; i++ ){
    		if (arr[i] != 0) {
    			return false;
    		}
    	}
    	return true;
    }

    public static void main(String[] argvs){
    	isAnagram obj = new isAnagram();
    	String s = "anagram";
    	String t = "nagaram";
    	boolean res = obj.solution(s, t);
    	System.out.println(res);
    }
}