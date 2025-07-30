public class split53 {
  public boolean split53(int[] nums) {
    return helperMethod(nums, 0, 0, 0);
  }

  public boolean helperMethod(int[] nums, int index, int sum5, int sum3) {
    if (index >= nums.length) {
      return (sum5 == sum3);
    }
    if (nums[index] % 5 == 0) {
      return (helperMethod(nums, index + 1, sum5 + nums[index], sum3));
    } else if (nums[index] % 3 == 0) {
      return (helperMethod(nums, index + 1, sum5, sum3 + nums[index]));
    }
    if (helperMethod(nums, index + 1, sum5 + nums[index], sum3)) return true;
    if (helperMethod(nums, index + 1, sum5, sum3 + nums[index])) return true;
    return false;
  }
}
