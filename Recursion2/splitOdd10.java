public class splitOdd10 {
  public boolean splitOdd10(int[] nums) {
    return helperMethod(nums, 0, 0, 0);
  }

  public boolean helperMethod(int[] nums, int index, int sum10, int sumOdd) {
    if (index >= nums.length) {
      return (sum10 % 10 == 0 && sumOdd % 2 != 0);
    }
    if (helperMethod(nums, index + 1, sum10 + nums[index], sumOdd)) return true;
    if (helperMethod(nums, index + 1, sum10, sumOdd + nums[index])) return true;
    return false;
  }
}
