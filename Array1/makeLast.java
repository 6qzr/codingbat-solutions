public class makeLast {
  public int[] makeLast(int[] nums) {
    int[] newList = new int[nums.length*2];
    newList[newList.length-1] = nums[nums.length-1];
    return newList;
  }
}
