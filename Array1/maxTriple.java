public class maxTriple {
  public int maxTriple(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int mid = nums.length/2;
    return Math.max(nums[mid], Math.max(nums[0], nums[nums.length-1]));
  }
}
