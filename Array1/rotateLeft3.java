public class rotateLeft3 {
  public int[] rotateLeft3(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = temp;
    temp = nums[0];
    nums[0] = nums[1];
    nums[1] = temp;
    return nums;
  }

}
