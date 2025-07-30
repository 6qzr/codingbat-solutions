public class groupSumClump {
  public boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) return (target == 0);
    int i = start;
    int clumpSum = 0;
    while (i < nums.length && nums[i] == nums[start]) {
        clumpSum += nums[i];
        i++;
    }
    if (groupSumClump(i, nums, target - clumpSum)) return true;
    if (groupSumClump(i, nums, target)) return true;
    return false;
  }
}
