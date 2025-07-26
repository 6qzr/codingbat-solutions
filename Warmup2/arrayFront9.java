public class arrayFront9 {
  public boolean arrayFront9(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 9) {
        return true;
      }
      if (i >= 3) {
        return false;
      }
    }
    return false;
  }
}
