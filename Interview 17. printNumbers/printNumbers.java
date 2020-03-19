import java.util.*;

class printNumbers {
	StringBuilder sb;

    public boolean increment(int n) {
    	boolean carry = false;
    	for (int i = 0; i < sb.length(); i++){
    		if (carry || i == 0) {
    			if (sb.charAt(i) == '9'){
    				sb.setCharAt(i, '0');
    				carry = true;
    			}
    			else {
    				sb.setCharAt(i, (char) (sb.charAt(i) + 1));
    				carry = false;
    			}
    		}
    		else {
    			break;
    		}
    	}

    	if (carry) {
    		sb.append("1");
    	}

    	return sb.length() <= n;
    	
    }

    private void save(ArrayList list){
    	int elem = Integer.parseInt(sb.reverse().toString());
    	list.add(elem);
    	sb.reverse();
    }

    public int[] solution(int n) {

    	ArrayList list = new ArrayList();
    	sb = new StringBuilder("0");

    	while (increment(n)){
    		save(list);
    	}

    	//print result
    	Integer[] b = new Integer[list.size()];
    	int[] result = new int[list.size()];
		b = (Integer[])list.toArray(b);
		for (int i = 0; i < b.length; i++) {
    		result[i] = b[i].intValue();
    		System.out.print(result[i] + " ");
    	}
    	return result;
    }

    public static void main(String[] argv){
    	printNumbers obj = new printNumbers();
    	int[] res = obj.solution(4);
    	for (int i = 0; i < res.length; i++) {
    		System.out.print(res[i] + " ");
    	}
    	System.out.println(" ");
    }
}