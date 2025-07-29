public class groupSum {
  public boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return (target == 0);
    }
    boolean chosen = groupSum(start + 1, nums, target - nums[start]);
    boolean notChosen = groupSum(start + 1, nums, target);
    return chosen || notChosen;
  }
}
