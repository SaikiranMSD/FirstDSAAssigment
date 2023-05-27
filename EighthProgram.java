class EighthProgram {
	public int[] findErrorNums(int[] nums) {
		int N = nums.length, sum = N * (N + 1) / 2;
		int[] ans = new int[2];
		boolean[] seen = new boolean[N + 1];
		for (int num : nums) {
			sum -= num;
			if (seen[num])
				ans[0] = num;
			seen[num] = true;
		}
		ans[1] = sum + ans[0];
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		EighthProgram solution = new EighthProgram();
		int[] result = solution.findErrorNums(nums);
		System.out.print("Output: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}