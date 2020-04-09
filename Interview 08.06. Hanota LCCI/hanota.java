import java.util.*;
class hanota {
    public void solution(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        if (n == 0) {
        	return;
        }
        move(n, A, B, C);
    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
    	if (n == 1) {
    		C.add(A.remove(A.size() - 1));
    		return;
    	}
    	move(n - 1, A, C, B);
    	C.add(A.remove(A.size() - 1));
    	move(n - 1, B, A, C);
    }

    public static void main(String[] argv) {
    	List<Integer> A = new ArrayList<>();
    	A.add(2);
    	A.add(1);
    	A.add(0);
    	List<Integer> B = new ArrayList<>();
    	List<Integer> C = new ArrayList<>();
    	hanota obj = new hanota();
    	obj.solution(A, B, C);
    }
}