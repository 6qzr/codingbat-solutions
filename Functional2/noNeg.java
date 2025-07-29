public class noNeg {
  public List<Integer> noNeg(List<Integer> nums) {
    nums = nums.stream()
      .filter(n -> n >= 0)
      .collect(Collectors.toList());
    return nums;
  }
}
