public class square56 {
  public List<Integer> square56(List<Integer> nums) {
    nums.replaceAll(n -> n * n + 10);
    nums = nums.stream()
      .filter(n -> n % 10 != 5 && n % 10 != 6)
      .collect(Collectors.toList());
    return nums;
  }
}
