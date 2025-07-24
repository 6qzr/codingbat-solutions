public class reverse3 {
  public int[] reverse3(int[] nums) {
    int first = nums[0];
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = first;
    return nums;
  }
}
