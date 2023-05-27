public class FirstProgram {
	public int[] sumOfTwo(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		FirstProgram firstProgram = new FirstProgram();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = firstProgram.sumOfTwo(nums, target);
		System.out.println(result[0] + ", " + result[1]);
	}
}