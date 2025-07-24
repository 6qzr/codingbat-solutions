public class makeMiddle {
  public int[] makeMiddle(int[] nums) {
    int[] newList = new int[2];
    int mid = nums.length/2;
    newList[0] = nums[mid-1];
    newList[1] = nums[mid];
    return newList;
  }
}
