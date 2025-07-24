public class frontPiece {
  public int[] frontPiece(int[] nums) {
    if (nums.length <= 2) {
      return nums;
    }
    int[] newList = new int[2];
    newList[0] = nums[0];
    newList[1] = nums[1];
    return newList;
  }
}
