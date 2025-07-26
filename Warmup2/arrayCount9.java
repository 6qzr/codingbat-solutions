public class arrayCount9 {
  public int arrayCount9(int[] nums) {
    int count = 0;
    for (int element : nums) {
      if (element == 9) count++;
    }
    return count;
  }
}
