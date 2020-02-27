import java.util.HashMap;
public class twoSum{
	public int[] Solution(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int targetNum = target - nums[i];
			if (map.containsKey(targetNum)) {
				return new int[] {i, map.get(targetNum)};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution.");
	}
	public static void main(String[] args) {
		twoSum twoSum = new twoSum();
		int[] arr = {5, 5, 11, 15};
		int target = 10;
		int[] result = twoSum.Solution(arr, target);
		System.out.println(result[0] + "," + result[1]);
	}
}