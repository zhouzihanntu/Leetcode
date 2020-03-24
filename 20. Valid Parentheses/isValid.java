import java.util.Stack;  

class isValid {
    public boolean solution(String s) {
    	Boolean valid = true;
    	int idx = 0;
    	int len = s.length();
    	Stack<Character> stack = new Stack<Character>();
    	while(valid && idx < len){
    		if (s.charAt(idx) == '(' || s.charAt(idx) == '[' || s.charAt(idx) == '{'){
    			stack.push(s.charAt(idx));
    		}
    		else{
    			if(!stack.isEmpty()){
    				char temp = stack.pop();
    				if( !(s.charAt(idx) == ')' && temp == '(') && !(s.charAt(idx) == ']' && temp == '[') && !(s.charAt(idx) == '}' && temp == '{') ){
    					valid = false;
    				}
    			}
    			else{
    				valid = false;
    			}
    		}
    		idx = idx + 1;
    	}
    	if(!stack.isEmpty()){
    		valid = false;
    	}
    	return valid;
    }

    public static void main(String[] argv){
    	isValid obj = new isValid();
    	String str = "";
    	Boolean res = obj.solution(str);
    	System.out.println(res);

    }
}