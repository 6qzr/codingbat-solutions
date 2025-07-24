public class midThree {
  public int[] midThree(int[] nums) {
    int[] newList = new int[3];
    int mid = (nums.length+1)/2;
    newList[2] = nums[mid];
    newList[1] = nums[mid-1];
    newList[0] = nums[mid-2];
    return newList;
  }
}
