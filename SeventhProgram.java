class SeventhProgram {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;

		int insertPos = 0;
		for (int num : nums) {
			if (num != 0)
				nums[insertPos++] = num;
		}

		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		SeventhProgram solution = new SeventhProgram();
		solution.moveZeroes(nums);
		System.out.print("Output: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}