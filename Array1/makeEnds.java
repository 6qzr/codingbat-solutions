public class makeEnds {
  public int[] makeEnds(int[] nums) {
    int[] numEnds = new int[2];
    if (nums.length > 1) {
      numEnds[0] = nums[0];
      numEnds[1] = nums[nums.length-1];
    }
    else {
      numEnds[0] = nums[0];
      numEnds[1] = nums[0];
    }
    return numEnds;
  }
}
