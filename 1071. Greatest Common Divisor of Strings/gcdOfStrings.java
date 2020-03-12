public class gcdOfStrings{
	public String solution(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int a = str1.length();
		int b = str2.length();
		int mod = a % b;
		while (mod > 0) {
			a = b;
			b = mod;
			mod = a % b;
		}
		return str1.substring(0, b);
    }

    public static void main(String[] argvs){
    	gcdOfStrings test = new gcdOfStrings();
    	String str1 = "ABCABCABC";
    	String str2 = "ABCABC";
    	String res = test.solution(str1, str2);
    	System.out.println(res);
    }
}