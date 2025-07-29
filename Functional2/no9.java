public class no9 {
  public List<Integer> no9(List<Integer> nums) {
    nums = nums.stream()
      .filter(n -> n % 10 != 9)
      .collect(Collectors.toList());
    return nums;
  }
}
