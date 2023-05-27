import java.util.*;

class SixthProgram {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		SixthProgram solution = new SixthProgram();
		boolean containsDuplicate = solution.containsDuplicate(nums);
		System.out.println("Output: " + containsDuplicate);
	}

}
