public class noTeen {
  public List<Integer> noTeen(List<Integer> nums) {
    nums = nums.stream()
      .filter(n -> n < 13 || n > 19)
      .collect(Collectors.toList());
    return nums;
  }
}
