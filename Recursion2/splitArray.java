public class splitArray {
  public boolean splitArray(int[] nums) {
    return helperMethod(nums, 0, 0, 0);
  }

  private boolean helperMethod(int[] nums, int index, int sum1, int sum2) {
    if (index == nums.length) {
      return sum1 == sum2;
    }
    if (helperMethod(nums, index + 1, sum1 + nums[index], sum2)) {
      return true;
    }
    if (helperMethod(nums, index + 1, sum1, sum2 + nums[index])) {
      return true;
    }
    return false;
  }
}
