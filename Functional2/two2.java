public class two2 {
  public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(n -> n * 2);
    nums = nums.stream()
      .filter(n -> n % 10 != 2)
      .collect(Collectors.toList());
    return nums;
  }
}
