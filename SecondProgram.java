public class SecondProgram {
	public int removeElement(int[] nums, int val) {
		int originalSize = nums.length;
		for (int j : nums) {
			if (j == val) {
				originalSize = originalSize - 1;
			}
		}
		return originalSize;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		SecondProgram secondProgram = new SecondProgram();
		int newLength = secondProgram.removeElement(nums, val);

		System.out.println("Modified array length: " + newLength);
	}
}